package com.lx.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/29.
 *
 *员工表
 *包括普通员工和管理员（通过state判断）
 */
public class Employee implements Serializable{
    private int id;
    private String name;//通过“Employee”+“id”的形式规定登陆账号
    private String pass;//默认12345
    private  int state;

    public Employee() {
    }

    public Employee(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public Employee(String name, String pass, int state) {
        this.name = name;
        this.pass = pass;
        this.state = state;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", state=" + state +
                '}';
    }
}
