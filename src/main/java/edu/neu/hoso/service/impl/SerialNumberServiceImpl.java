package edu.neu.hoso.service.impl;

import edu.neu.hoso.service.SerialNumberService;
import edu.neu.hoso.utils.RedisUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SerialNumberServiceImpl implements SerialNumberService {
    @Resource
    private RedisUtils redisUtils;
    /**
     * 定义流水号工单默认前缀
     */
    private static final String SERIAL_NUMBER = "itsm:serial:";
    private static final String MEDICAL_CODE = "ME";
    private static final String INVOICE_NO = "IN";

    @Override
    public String generateSerialNumber(int choice) throws ParseException {
        /**
         *@title: generateSerialNumber
         *@description: 生成序列号 1为ME 2为IN
         *@author: Mike
         *@date: 2019-06-14 13:53
         *@param: [choice]
         *@return: java.lang.String
         *@throws:
         */
        //获取当前时间,返回格式如yyyyMMdd
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());

        //构造redis过期时间 UnixMillis
        //设置过期时间为当天的最后一秒
        long expire = (new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse(date + " 23:59:59").getTime() - new Date().getTime()) / 1000;

        //判断choice
        String code = "";
        switch (choice){
            case 1:
                code = MEDICAL_CODE;
                break;
            case 2:
                code = INVOICE_NO;
                break;
        }
        //构造redis的key
        String key = SERIAL_NUMBER + date + ":" + code;

        //判断key是否存在
        Boolean exists = redisUtils.hasKey(key);

        Long incr = redisUtils.incr(key, 1);

        //设置过期时间
        if (!exists) {
            redisUtils.expire(key, expire);
        }

        //默认编码需要3位，位数不够前面补0
        String number = String.format("%03d", incr);
        StringBuilder sb = new StringBuilder(20);
        //转换成业务需要的格式  bizCode + date + incr
        sb.append(code).append(date).append(number);

        return sb.toString();
    }
}