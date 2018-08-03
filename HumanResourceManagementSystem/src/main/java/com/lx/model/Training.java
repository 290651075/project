package com.lx.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/7/30.
 *
 * 培训表
 *
 */
public class Training implements Serializable {
    private int id;
    private String theme;//培训主题
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date start;//培训开始时间
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date end;//培训结束时间
    private String trainingCon;//培训内容
    private String place;//培训地点
    private int state;//发布状态
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date issueTime;//发布时间 1 发布  2不发布

    public Training() {
    }

    public Training(int state) {
        this.state = state;
    }

    public Training(String theme,Date start, Date end, String trainingCon) {
        this.theme = theme;
        this.start = start;
        this.end = end;
        this.trainingCon = trainingCon;
    }

    public Training(String theme, Date start, Date end, String trainingCon, String place) {
        this.theme = theme;
        this.start = start;
        this.end = end;
        this.trainingCon = trainingCon;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getTrainingCon() {
        return trainingCon;
    }

    public void setTrainingCon(String trainingCon) {
        this.trainingCon = trainingCon;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", theme='" + theme + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", trainingCon='" + trainingCon + '\'' +
                ", place='" + place + '\'' +
                ", state=" + state +
                ", issueTime=" + issueTime +
                '}';
    }
}
