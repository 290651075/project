package com.lx.controller;

import com.lx.model.Recruitment;
import com.lx.service.DepartmentService;
import com.lx.service.PositionService;
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
    @RequestMapping("/ ")
    public String getRecruitmentInfo(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, HttpSession session){
        int state=1;
        List<Recruitment> recruitments=recruitmentService.getRecruitmentByState(state);
        int totalNum=recruitments.size();
        int pageSize=1;
        int totalPages=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<Recruitment> recruitments1=recruitmentService.getRecruitmentByStateAndPage(state,begin,end);
               System.out.println("*********************");
        System.out.println(recruitments1.get(0));
        session.setAttribute("recruitments",recruitments1);
        session.setAttribute("totalPages",totalPages);
        return "../../login";
    }
    //添加招聘信息
    @RequestMapping("/")
    public String addRec(Recruitment recruitment,HttpSession session){
        recruitmentService.addRecruitment(recruitment);
        return "";
    }
    //删除招聘信息
    @RequestMapping("")
    public String deleteRec(Recruitment recruitment,HttpSession session){
        recruitmentService.deleteRecruitment(recruitment);
        return "";
    }
    //修改招聘信息
    @RequestMapping("")
    public  String updateRec(Recruitment recruitment, HttpSession session){
        recruitmentService.updateRecruitment(recruitment);
        return "";
    }
}
