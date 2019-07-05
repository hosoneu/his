package edu.neu.hoso.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SchedulingInfo {
    private Integer schedulingInfoId;

    private Integer doctorId;

    private String schedulingNoonbreak;

    private Date schedulingStarttime;

    private Date schedulingEndtime;

    private String schedulingWeekday;

    private Integer schedulingLimitcount;

    private Integer schedulingRestcount;

    @Getter
    @Setter
    private User user;

    public SchedulingInfo(Integer schedulingInfoId, Integer doctorId, String schedulingNoonbreak, Date schedulingStarttime, Date schedulingEndtime, String schedulingWeekday, Integer schedulingLimitcount, Integer schedulingRestcount) {
        this.schedulingInfoId = schedulingInfoId;
        this.doctorId = doctorId;
        this.schedulingNoonbreak = schedulingNoonbreak;
        this.schedulingStarttime = schedulingStarttime;
        this.schedulingEndtime = schedulingEndtime;
        this.schedulingWeekday = schedulingWeekday;
        this.schedulingLimitcount = schedulingLimitcount;
        this.schedulingRestcount = schedulingRestcount;
    }

    public SchedulingInfo() {
        super();
    }

    public Integer getSchedulingInfoId() {
        return schedulingInfoId;
    }

    public void setSchedulingInfoId(Integer schedulingInfoId) {
        this.schedulingInfoId = schedulingInfoId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getSchedulingNoonbreak() {
        return schedulingNoonbreak;
    }

    public void setSchedulingNoonbreak(String schedulingNoonbreak) {
        this.schedulingNoonbreak = schedulingNoonbreak == null ? null : schedulingNoonbreak.trim();
    }

    public Date getSchedulingStarttime() {
        return schedulingStarttime;
    }

    public void setSchedulingStarttime(Date schedulingStarttime) {
        this.schedulingStarttime = schedulingStarttime;
    }

    public Date getSchedulingEndtime() {
        return schedulingEndtime;
    }

    public void setSchedulingEndtime(Date schedulingEndtime) {
        this.schedulingEndtime = schedulingEndtime;
    }

    public String getSchedulingWeekday() {
        return schedulingWeekday;
    }

    public void setSchedulingWeekday(String schedulingWeekday) {
        this.schedulingWeekday = schedulingWeekday == null ? null : schedulingWeekday.trim();
    }

    public Integer getSchedulingLimitcount() {
        return schedulingLimitcount;
    }

    public void setSchedulingLimitcount(Integer schedulingLimitcount) {
        this.schedulingLimitcount = schedulingLimitcount;
    }

    public Integer getSchedulingRestcount() {
        return schedulingRestcount;
    }

    public void setSchedulingRestcount(Integer schedulingRestcount) {
        this.schedulingRestcount = schedulingRestcount;
    }
}