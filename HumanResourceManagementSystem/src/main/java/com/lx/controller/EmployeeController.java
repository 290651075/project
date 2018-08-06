package com.lx.controller;

import com.lx.model.*;
import com.lx.service.*;
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
    @Resource
    private RecruitmentService recruitmentService;
    @Resource
    private ResumeService resumeService;
    @Resource
    private InterviewService interviewService;
    @Resource
    private DepartmentService departmentService;
    @Resource
    private PositionService positionService;
    @Resource
    private EInfoService eInfoService;
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
    //员工入职
    @RequestMapping("/entry")
    public String entry(Interview interview,HttpSession session){
        Interview interview1=interviewService.getInterviewById(interview);
        Recruitment recruitment=recruitmentService.getRecruitmentById(new Recruitment(interview1.getRecruitment().getId()));
        Resume resume=resumeService.getResumeById(new Resume(interview1.getResume().getId()));
        Employee employee=new Employee("123","123",1);
        employeeService.addEmployee(employee);
        String str="Employee"+(employee.getId());
     /*   System.out.println("@@@@@@@@@@");
        System.out.println(employee);
        System.out.println(str);*/
        employee.setId(employee.getId());
        employee.setName(str);
        employeeService.updateEmployeeN(employee);
        session.setAttribute("employee",employee);
        Department department=departmentService.getDepartmentById(new Department(recruitment.getDepartment().getId()));
        Position position=positionService.getPositionById(new Position(recruitment.getPosition().getId()));
        EInfo eInfo=new EInfo();
        eInfo.setAge(25);
        eInfo.setDepartment(department);
        eInfo.setEmail(resume.getEmail());
        eInfo.setEmployee(employee);
        eInfo.setName(resume.getName());
        eInfo.setPhone(resume.getPhone());
        eInfo.setPosition(position);
        eInfo.setSex(resume.getSex());
        System.out.println(eInfo);
        eInfoService.addEInfo(eInfo);
        session.setAttribute("eIfoE",eInfo);
        return "EMInfo";
    }
    @RequestMapping("/returnE")
    public String returnE(){
        return "success";
    }
    //职员登陆
    @RequestMapping("/eM")
    public String eLogin(Employee employee, HttpSession session) {
        employee.setState(1);
        Employee employee1=employeeService.getEmployee(employee);
        if (null!=employee1){
            session.setAttribute("admin",employee1);
            return "employee";
        }
        return "adminFail";
    }
    //跳转
    @RequestMapping("/eM1")
    public String eLogin(){
        return "eLogin";
    }
}
