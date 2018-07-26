package com.lx.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/25.
 *
 * 游客表
 *
 * 游客
 */
public class Tourist implements Serializable {
    private int id ;
    private String name;
    private String pass;
    private int state;//好像不用状态

    public Tourist() {
    }

    public Tourist(String name, String pass) {
        this.name = name;
        this.pass = pass;
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
        return "Tourist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", state=" + state +
                '}';
    }
}
