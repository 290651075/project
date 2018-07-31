package com.lx.controller;

import com.lx.model.Interview;
import com.lx.model.ResAndRec;
import com.lx.model.Resume;
import com.lx.service.InterviewService;
import com.lx.service.RecruitmentService;
import com.lx.service.ResAndRecService;
import com.lx.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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
        Interview interview=new Interview();
        interview.setRecruitment(resAndRec1.getRecruitment());
        interview.setResume(resAndRec1.getResume());
        interview.setInviteState(1);
        interview.setResultState(0);
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
    public String lookMail(){
        return "lookMail";
    }
}
