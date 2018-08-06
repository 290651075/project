package com.lx.service;

import com.lx.model.Employee;

/**
 * Created by Administrator on 2018/7/29.
 */
public interface EmployeeService {
    Employee getEmployee(Employee employee);
    void addEmployee(Employee employee);
    void updateEmployeeN(Employee employee);
}
