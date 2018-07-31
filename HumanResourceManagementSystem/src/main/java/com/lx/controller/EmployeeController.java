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
    //管理员登录
    @RequestMapping("/admin")
    public String aLogin(Employee employee, HttpSession session) {
        employee.setState(2);
        Employee employee1=employeeService.getEmployee(employee);
        if (null!=employee1){
            session.setAttribute("admin",employee1);
            return "admin";
        }
        return "adminFail";
    }
    //跳转
    @RequestMapping("/admin1")
    public String aLogin(){
        return "adminLogin";
    }
    @RequestMapping("/aFail")
    public String fail(){
        return "login";
    }


}
