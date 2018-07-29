package com.lx.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/30.
 *
 * 职位和部门多对多关联的中间表
 *
 */
public class DepAndPos implements Serializable{
    private int id;
    private Department department;
    private Position position;

    public DepAndPos(Department department, Position position) {
        this.department = department;
        this.position = position;
    }

    public DepAndPos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "DepAndPos{" +
                "id=" + id +
                ", department=" + department +
                ", position=" + position +
                '}';
    }
}
