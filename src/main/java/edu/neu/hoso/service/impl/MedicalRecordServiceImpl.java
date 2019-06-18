package edu.neu.hoso.service.impl;

import edu.neu.hoso.model.MedicalRecord;
import edu.neu.hoso.model.MedicalRecordMapper;
import edu.neu.hoso.service.MedicalRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: MedicalRecordServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 实现对病历的操作：根据患者ID列出历史病历等
 * @author: 29-y
 * @date: 2019-06-14 10:19
 * @version: V1.0
*/
@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {
    @Resource
    MedicalRecordMapper medicalRecordMapper;

    /**
     * @title: listMedicalRecordHistoryByPatientId
     * @description: 根据患者ID列出历史病历（诊毕的）
     * @author: 29-y
     * @date: 2019-06-17 10:18
     * @param: [patientId]
     * @return: java.util.List<edu.neu.hoso.model.MedicalRecord>
     * @throws:
     */
    @Override
    public List<MedicalRecord> listMedicalRecordHistoryByPatientId(Integer patientId) {
        return medicalRecordMapper.listMedicalRecordHistoryByPatientId(patientId);
    }
}