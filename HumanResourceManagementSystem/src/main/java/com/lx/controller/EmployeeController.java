package com.lx.controller;

import com.lx.model.Employee;
import com.lx.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/7/29.
 */
@Controller
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;
    @RequestMapping("/lx")
    public String ELogin(Employee employee, HttpSession session) {
        Employee employee1=employeeService.getEmployee(employee);
        if (null!=employee1){
            session.setAttribute("employee",employee1);
            return "#";
        }
        return "#";
    }
}
