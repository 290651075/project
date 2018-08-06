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
    private int month;//考勤时间段 （以一个月为一段）记录时期 列如 2018-06 即为6月份的考勤
    private int day;//考勤时间段
    private int state;//上班状态 1 正常上班 2迟到（早退）3小时以内 3 旷工  4 加班
    private EInfo eInfo;//该条考勤记录对应的员工
    public Attendance() {
    }

    public Attendance(String sWork, String eWork, String sOvertime, String eOvertime, int month, int day, int state, EInfo eInfo) {
        this.sWork = sWork;
        this.eWork = eWork;
        this.sOvertime = sOvertime;
        this.eOvertime = eOvertime;
        this.month = month;
        this.day = day;
        this.state = state;
        this.eInfo = eInfo;
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


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public EInfo geteInfo() {
        return eInfo;
    }

    public void seteInfo(EInfo eInfo) {
        this.eInfo = eInfo;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", sWork='" + sWork + '\'' +
                ", eWork='" + eWork + '\'' +
                ", sOvertime='" + sOvertime + '\'' +
                ", eOvertime='" + eOvertime + '\'' +
                ", month=" + month +
                ", day=" + day +
                ", state=" + state +
                ", eInfo=" + eInfo +
                '}';
    }
}
