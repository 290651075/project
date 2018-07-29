package com.lx.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/30.
 *
 * 培训表
 *
 */
public class Training implements Serializable {
    private int id;
    private String theme;//培训主题
    private String start;//培训开始时间
    private String end;//培训结束时间
    private String trainingCon;//培训内容

    public Training() {
    }

    public Training(String theme, String start, String end, String trainingCon) {
        this.theme = theme;
        this.start = start;
        this.end = end;
        this.trainingCon = trainingCon;
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

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getTrainingCon() {
        return trainingCon;
    }

    public void setTrainingCon(String trainingCon) {
        this.trainingCon = trainingCon;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", theme='" + theme + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", trainingCon='" + trainingCon + '\'' +
                '}';
    }
}
