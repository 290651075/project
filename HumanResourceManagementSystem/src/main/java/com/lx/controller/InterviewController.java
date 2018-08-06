package com.lx.controller;

import com.lx.model.*;
import com.lx.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/7/26.
 */
@Controller
public class InterviewController {
    @Resource
    private InterviewService interviewService;
    @Resource
    private ResAndRecService resAndRecService;
    @Resource
    private ResumeService resumeService;
    @Resource
    private RecruitmentService recruitmentService;
    @Resource
    private DepartmentService departmentService;
    @Resource
    private PositionService positionService;
 /*   @RequestMapping("/aa")
    //收件箱  显示未确认参加的邀请信息
    public String getInterviewByT(){
        return "/bb";
    }*/
  /*  //选择是否参见
    @RequestMapping("/cc")*/
    public String updateInterview(HttpSession session){
        return "/dd";
    }
    //面试成功，确认入职
 /*   @RequestMapping("")
    public String getEmployee(){*/
    //管理员发送面试邀请
    @RequestMapping("/sendIn")
    public String sendIn(ResAndRec resAndRec,HttpSession session){
        ResAndRec resAndRec1=resAndRecService.getResAndRecById(resAndRec);
        Resume resume=resumeService.getResumeById(resAndRec1.getResume());
        Interview interview=new Interview();
        interview.setRecruitment(resAndRec1.getRecruitment());
        interview.setResume(resAndRec1.getResume());
        interview.setInviteState(1);
        interview.setResultState(0);
        interview.setTourist(resume.getTourist());
        interviewService.addInterview(interview);
        resAndRecService.deleteResAndRecById(resAndRec);
        return "admin";
    }
    @RequestMapping("/sendIn1")
    public String sendIn1(ResAndRec resAndRec,HttpSession session){
        ResAndRec resAndRec1=resAndRecService.getResAndRecById(resAndRec);
        Resume resume=resumeService.getResumeById(resAndRec1.getResume());
        Interview interview=new Interview();
        interview.setRecruitment(resAndRec1.getRecruitment());
        interview.setResume(resAndRec1.getResume());
        interview.setInviteState(2);
        interview.setResultState(0);
        interview.setTourist(resume.getTourist());
        interviewService.addInterview(interview);
        resAndRecService.deleteResAndRecById(resAndRec);
        return "admin";
    }
    //游客查看信箱
    @RequestMapping("/lookMail")
    public String lookMail(HttpSession session){
        System.out.println("22222222222");
        Tourist tourist= (Tourist) session.getAttribute("tourist");
        Interview interview=new Interview(tourist);
        interview.setInviteState(1);
        interview.setResultState(0);
        System.out.println(interview);
        List<Interview> interviews=interviewService.getInterviewByT(interview);
        System.out.println(interviews.get(0));
        System.out.println(interviews.size());
        for (int i=0;i<interviews.size();i++){
            Recruitment recruitment=recruitmentService.getRecruitmentById(new Recruitment(interviews.get(i).getRecruitment().getId()));
            Department department=departmentService.getDepartmentById(new Department(recruitment.getDepartment().getId()));
            Position position=positionService.getPositionById(new Position(recruitment.getPosition().getId()));
            recruitment.setDepartment(department);
            recruitment.setPosition(position);
            interviews.get(i).setRecruitment(recruitment);
            System.out.println("*******");
            System.out.println(interviews.get(i));
        }
        session.setAttribute("interviews",interviews);
        return "lookMail";
    }
    //接受邀请
    @RequestMapping("/accept")
    public String accept(Interview interview){
        interview.setInviteState(3);
        System.out.println(interview);
        interviewService.updateInterview(interview);
        return "lookMail";
    }
    //拒绝邀请
    @RequestMapping("/refuse")
    public String refuse(Interview interview){
        interview.setInviteState(4);
        interviewService.updateInterview(interview);
        return "lookMail";
    }
    //进行面试
    @RequestMapping("/getAllint")
    public String getAllint(HttpSession session){
        int inviteState=3;
        int resultState=0;
        Interview interview=new Interview(inviteState,resultState);
        List<Interview> interviews=interviewService.getInterivew(interview);
        for (int i=0;i<interviews.size();i++){
            Resume resume=resumeService.getResumeById(new Resume(interviews.get(i).getResume().getId()));
            interviews.get(i).setResume(resume);
        }
        session.setAttribute("interviewsAD",interviews);
        return "getAllint";
    }
    //录用
    @RequestMapping("/hire")
    public String hire(Interview interview){
        interview.setResultState(1);
        interviewService.updateInterviewR(interview);
        return "admin";
    }
    @RequestMapping("/noHire")
    public String noHire(Interview interview){
        interview.setResultState(2);
        interviewService.updateInterviewR(interview);
        return "admin";
    }
    //游客查看面试结果
    @RequestMapping("/lookInR")
    public String lookInR(HttpSession session){
        Tourist tourist= (Tourist) session.getAttribute("tourist");
        Interview interview=new Interview(tourist);
        interview.setResultState(1);
        List<Interview> interviews=interviewService.getInterviewRByT(interview);
        for (int i=0;i<interviews.size();i++){
            Recruitment recruitment=recruitmentService.getRecruitmentById(new Recruitment(interviews.get(i).getRecruitment().getId()));
            Department department=departmentService.getDepartmentById(new Department(recruitment.getDepartment().getId()));
            Position position=positionService.getPositionById(new Position(recruitment.getPosition().getId()));
            recruitment.setDepartment(department);
            recruitment.setPosition(position);
            interviews.get(i).setRecruitment(recruitment);
        }
        session.setAttribute("interviewsR",interviews);
        return "lookInR";
    }
}
