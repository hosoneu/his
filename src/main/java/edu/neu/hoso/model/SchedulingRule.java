package edu.neu.hoso.model;

import java.util.Date;

public class SchedulingRule {
    private Integer schedulingRuleId;

    private Integer doctorId;

    private String schedulingRuleNoonbreak;

    private Date schedulingRuleStarttime;

    private Date schedulingRuleEndtime;

    private String schedulingRuleWeekday;

    private Integer schedulingRuleLimitcount;

    public SchedulingRule(Integer schedulingRuleId, Integer doctorId, String schedulingRuleNoonbreak, Date schedulingRuleStarttime, Date schedulingRuleEndtime, String schedulingRuleWeekday, Integer schedulingRuleLimitcount) {
        this.schedulingRuleId = schedulingRuleId;
        this.doctorId = doctorId;
        this.schedulingRuleNoonbreak = schedulingRuleNoonbreak;
        this.schedulingRuleStarttime = schedulingRuleStarttime;
        this.schedulingRuleEndtime = schedulingRuleEndtime;
        this.schedulingRuleWeekday = schedulingRuleWeekday;
        this.schedulingRuleLimitcount = schedulingRuleLimitcount;
    }

    public SchedulingRule() {
        super();
    }

    public Integer getSchedulingRuleId() {
        return schedulingRuleId;
    }

    public void setSchedulingRuleId(Integer schedulingRuleId) {
        this.schedulingRuleId = schedulingRuleId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getSchedulingRuleNoonbreak() {
        return schedulingRuleNoonbreak;
    }

    public void setSchedulingRuleNoonbreak(String schedulingRuleNoonbreak) {
        this.schedulingRuleNoonbreak = schedulingRuleNoonbreak == null ? null : schedulingRuleNoonbreak.trim();
    }

    public Date getSchedulingRuleStarttime() {
        return schedulingRuleStarttime;
    }

    public void setSchedulingRuleStarttime(Date schedulingRuleStarttime) {
        this.schedulingRuleStarttime = schedulingRuleStarttime;
    }

    public Date getSchedulingRuleEndtime() {
        return schedulingRuleEndtime;
    }

    public void setSchedulingRuleEndtime(Date schedulingRuleEndtime) {
        this.schedulingRuleEndtime = schedulingRuleEndtime;
    }

    public String getSchedulingRuleWeekday() {
        return schedulingRuleWeekday;
    }

    public void setSchedulingRuleWeekday(String schedulingRuleWeekday) {
        this.schedulingRuleWeekday = schedulingRuleWeekday == null ? null : schedulingRuleWeekday.trim();
    }

    public Integer getSchedulingRuleLimitcount() {
        return schedulingRuleLimitcount;
    }

    public void setSchedulingRuleLimitcount(Integer schedulingRuleLimitcount) {
        this.schedulingRuleLimitcount = schedulingRuleLimitcount;
    }
}