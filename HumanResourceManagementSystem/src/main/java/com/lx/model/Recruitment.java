package com.lx.model;

import oracle.sql.DATE;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/25.
 *
 * 招聘表（包含招聘信息和招聘职位的id）
 *
 * 招聘信息
 */
public class Recruitment implements Serializable {
    private int id;
    private String position;//职位
    private String department;//部门
    private String introduction;//职位简介
    private int salary;//工资
    private DATE date;//发布时间
    //private int renshu    招聘人数
    private int pId;//职位表id
    private int state;//发布状态 1代表已发布2代表未发布

    public Recruitment() {
    }

    public Recruitment(String position, String department, String introduction, int salary) {
        this.position = position;
        this.department = department;
        this.introduction = introduction;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public DATE getDate() {
        return date;
    }

    public void setDate(DATE date) {
        this.date = date;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Recruitment{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", introduction='" + introduction + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                ", pId=" + pId +
                ", state=" + state +
                '}';
    }
}
