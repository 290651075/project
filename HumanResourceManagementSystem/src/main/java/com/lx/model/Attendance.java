package com.lx.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/30.
 *
 * 考勤表
 *
 *
 */
public class Attendance implements Serializable {
    private int id;
    private String sWork;//上班打卡时间
    private String eWork;//下班打卡时间
    private String sOvertime;//开始加班时间
    private String eOvertime;//结束加班时间
    private String period;//考勤时间段 （以一个月为一段）记录时期 列如 2018-06 即为6月份的考勤
    private int state;//上班状态 1 正常上班 2迟到（早退）3小时以内 3 旷工  4 加班
    private Employee employee;//该条考勤记录对应的员工

    public Attendance() {
    }

    public Attendance(String sWork, String eWork, String sOvertime, String eOvertime, String period, int state, Employee employee) {
        this.sWork = sWork;
        this.eWork = eWork;
        this.sOvertime = sOvertime;
        this.eOvertime = eOvertime;
        this.period = period;
        this.state = state;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsWork() {
        return sWork;
    }

    public void setsWork(String sWork) {
        this.sWork = sWork;
    }

    public String geteWork() {
        return eWork;
    }

    public void seteWork(String eWork) {
        this.eWork = eWork;
    }

    public String getsOvertime() {
        return sOvertime;
    }

    public void setsOvertime(String sOvertime) {
        this.sOvertime = sOvertime;
    }

    public String geteOvertime() {
        return eOvertime;
    }

    public void seteOvertime(String eOvertime) {
        this.eOvertime = eOvertime;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", sWork='" + sWork + '\'' +
                ", eWork='" + eWork + '\'' +
                ", sOvertime='" + sOvertime + '\'' +
                ", eOvertime='" + eOvertime + '\'' +
                ", period='" + period + '\'' +
                ", state=" + state +
                ", employee=" + employee +
                '}';
    }
}
