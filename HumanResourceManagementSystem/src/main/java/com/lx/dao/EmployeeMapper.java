package com.lx.dao;

import com.lx.model.Employee;

/**
 * Created by Administrator on 2018/7/29.
 */
public interface EmployeeMapper {
    //员工登录（包括游客和管理员）
    Employee getEmployee(Employee employee);
    //员工录用
    void addEmployee(Employee employee);
    //修改员工用户名
    void updateEmployeeN(Employee employee);

}
