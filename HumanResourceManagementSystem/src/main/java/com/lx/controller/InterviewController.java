package com.lx.controller;

import com.lx.service.InterviewService;
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
    @RequestMapping("/aa")
    //收件箱  显示未确认参加的邀请信息
    public String getInterviewByT(){
        return "/bb";
    }
    //选择是否参见
    @RequestMapping("/cc")
    public String updateInterview(HttpSession session){
        return "/dd";
    }
    //面试成功，确认入职
    @RequestMapping("")
    public String getEmployee(){


}
