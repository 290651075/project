package com.lx.controller;

import com.lx.model.Recruitment;
import com.lx.service.RecruitmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/7/25.
 */
@Controller
public class RecruitmentController {
    @Resource
    private RecruitmentService recruitmentService;
    //显示招聘信息(分页）
    @RequestMapping("/")
    public String getRecruitmentInfo(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, HttpSession session){
        int state=1;
        System.out.println("*********************");
        List<Recruitment> recruitments=recruitmentService.getRecruitmentByState();
        int totalNum=recruitments.size();
        int pageSize=5;
        int totalPages=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<Recruitment> recruitments1=recruitmentService.getRecruitmentByStateAndPage(state,begin,end);
        session.setAttribute("recruitments",recruitments1);
        session.setAttribute("totalPages",totalPages);
        return "../../index";
    }
}
