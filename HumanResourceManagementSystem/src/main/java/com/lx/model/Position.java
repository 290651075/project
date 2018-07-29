package com.lx.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/30.
 *
 * 职位表
 *
 */
public class Position implements Serializable{
    private int id;
    private String name;

    public Position() {
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

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
