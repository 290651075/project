package com.lx.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/30.
 *
 * 奖惩表
 *
 */
public class Rewpun implements Serializable {
    private int id;
    private double amount;//奖惩金额
    private String date;//奖惩日期
    private String reason;//奖惩原因
    private Employee employee;//奖惩员工

    public Rewpun() {
    }

    public Rewpun(double amount, String date, String reason, Employee employee) {
        this.amount = amount;
        this.date = date;
        this.reason = reason;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Rewpun{" +
                "id=" + id +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", reason='" + reason + '\'' +
                ", employee=" + employee +
                '}';
    }
}
