package edu.neu.hoso.service.impl;

import edu.neu.hoso.model.Examination;
import edu.neu.hoso.model.ExaminationResult;
import edu.neu.hoso.model.GroupExamination;
import edu.neu.hoso.service.DoctorExaminationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorExaminationServiceImpl implements DoctorExaminationService {


    @Override
    public List<Examination> listExaminationByMedicalRecordId(Integer medicalRecordId, String mark) {
        return null;
    }

    @Override
    public List<Examination> selectExaminationById(Integer examinationId, String mark) {
        return null;
    }

    @Override
    public List<GroupExamination> listGroupExamination(Integer userId, String mark, String scope) {
        return null;
    }

    @Override
    public List<GroupExamination> selectGroupExaminationById(Integer userId, String mark) {
        return null;
    }

    @Override
    public Integer insertGroupExamination(GroupExamination groupExamination) {
        return null;
    }

    @Override
    public Integer insertExamination(Examination examination) {
        return null;
    }

    @Override
    public Integer ifExaminationItemsCanCancel() {
        return null;
    }

    @Override
    public void cancelExaminationItems(Integer examinationItemsId) {

    }

    @Override
    public ExaminationResult checkExaminationItemsResult(Integer examinationItemsId) {
        return null;
    }
}
