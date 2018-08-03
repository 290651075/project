package com.lx.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 *
 * 职位表
 *
 */
public class Position implements Serializable{
    private int id;
    private String name;
    private int state;//职位等级
    private Department department;//职位对应的部门

    public Position() {
    }

    public Position(int id) {
        this.id = id;
    }

    public Position(String name, int state) {
        this.name = name;
        this.state = state;
    }

    public Position(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Position(Department department) {
        this.department = department;
    }

    public Position(String name) {
        this.name = name;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", state=" + state +
                '}';
    }
}
