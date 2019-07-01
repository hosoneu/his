package edu.neu.hoso.utils;

import com.alibaba.fastjson.JSON;

import java.util.Map;

public class JsonUtils {
    public static String objToJson(Object obj) throws Exception {
        return JSON.toJSONString(obj);
    }

    public static <T> T jsonToObj(String jsonStr, Class<T> clazz) throws Exception {
        return JSON.parseObject(jsonStr, clazz);
    }

    public static <T> Map<String, Object> jsonToMap(String jsonStr)     throws Exception {
        return JSON.parseObject(jsonStr, Map.class);
    }

    public static <T> T mapToObj(Map<?, ?> map, Class<T> clazz) throws Exception {
        return JSON.parseObject(JSON.toJSONString(map), clazz);
    }
}
