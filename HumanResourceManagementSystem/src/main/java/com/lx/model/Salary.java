package com.lx.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/30.
 *
 * 薪资表
 *
 */
public class Salary implements Serializable{
    private int id;
    private double basics;//基本工资
    private double performance;//绩效
    private double bonus;//奖金
    private double subsidy;//补助
    private double overpay;//加班工资
    private double realSalary;//实发工资
    private Employee employee;//该工资条对应的员工

    public Salary() {
    }

    public Salary(double basics, double performance, double bonus, double subsidy, double overpay, double realSalary, Employee employee) {
        this.basics = basics;
        this.performance = performance;
        this.bonus = bonus;
        this.subsidy = subsidy;
        this.overpay = overpay;
        this.realSalary = realSalary;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBasics() {
        return basics;
    }

    public void setBasics(double basics) {
        this.basics = basics;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }

    public double getOverpay() {
        return overpay;
    }

    public void setOverpay(double overpay) {
        this.overpay = overpay;
    }

    public double getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(double realSalary) {
        this.realSalary = realSalary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", basics=" + basics +
                ", performance=" + performance +
                ", bonus=" + bonus +
                ", subsidy=" + subsidy +
                ", overpay=" + overpay +
                ", realSalary=" + realSalary +
                ", employee=" + employee +
                '}';
    }
}
