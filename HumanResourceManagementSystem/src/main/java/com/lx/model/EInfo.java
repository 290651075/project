package com.lx.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/30.
 * 员工信息表
 *
 *
 */
public class EInfo implements Serializable{
    private int id;
    private String name;
    private String sex;
    private int age;
    private int phone;
    private String email;
    private Department department;//部门
    private Position position;//职位
    private Training training;//培训

    public EInfo() {
    }

    public EInfo(Department department) {
        this.department = department;
    }

    public EInfo(String name, String sex, int age, int phone, String email, Department department, Position position, Training training) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.department = department;
        this.position = position;
        this.training = training;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    @Override
    public String toString() {
        return "EInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", training=" + training +
                '}';
    }
}
