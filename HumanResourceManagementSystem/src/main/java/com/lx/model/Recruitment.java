package com.lx.model;



import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/7/25.
 *
 * 招聘表（包含招聘信息和招聘职位的id）
 *
 * 招聘信息
 */
public class Recruitment implements Serializable {
    private int id;
    private String introduction;//职位简介
    private double salary;//工资
    private Date date;//发布时间
    private int pNum;// 招聘人数
    private int state;//发布状态 1代表已发布2代表未发布
    private Position position;//职位
    private Department department;//部门

    public Recruitment() {
    }

    public Recruitment(int id) {
        this.id = id;
    }

    public Recruitment(String introduction, double salary, Date date, int pNum, int state, Position position, Department department) {
        this.introduction = introduction;
        this.salary = salary;
        this.date = date;
        this.pNum = pNum;
        this.state = state;
        this.position = position;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getpNum() {
        return pNum;
    }

    public void setpNum(int pNum) {
        this.pNum = pNum;
    }


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Recruitment{" +
                "id=" + id +
                ", introduction='" + introduction + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                ", pNum=" + pNum +
                ", state=" + state +
                ", position=" + position +
                ", department=" + department +
                '}';
    }
}
