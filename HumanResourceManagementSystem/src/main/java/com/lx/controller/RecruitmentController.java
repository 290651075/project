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
    @RequestMapping("/")
    public String getRecruitmentInfo(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, HttpSession session){
        int state=1;
        List<Recruitment> recruitments=recruitmentService.getRecruitmentByState(state);
        System.out.println("********");
        System.out.println(recruitments);
        int totalNum=recruitments.size();
        int pageSize=1;
        int totalPages=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<Recruitment> recruitments1=recruitmentService.getRecruitmentByStateAndPage(state,begin,end);
        System.out.println("##########");
        System.out.println(recruitments1.size());
        session.setAttribute("recruitments",recruitments1);
        session.setAttribute("totalPages",totalPages);
        return "../../login";
    }
    //查询所有招聘信息
    @RequestMapping("/getAllRec")
    public String getAll(@RequestParam(value = "currentPage1",defaultValue = "1")int currentPage1, HttpSession session){
        List<Recruitment> recruitments=recruitmentService.getRecruitment();
        int totalNum=recruitments.size();
        int pageSize=1;
        int totalPages=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
        int begin = (currentPage1-1)*pageSize+1;
        int end = (currentPage1-1)*pageSize+pageSize;
        List<Recruitment> recruitments1=recruitmentService.getAllRecruitment(begin,end);
        session.setAttribute("recruitments5",recruitments1);
        session.setAttribute("totalPages5",totalPages);
        return "aRec";
    }
    //添加招聘信息
    @RequestMapping("/addRec1")
    public String addRec(Recruitment recruitment,HttpSession session){
        recruitmentService.addRecruitment(recruitment);
        return "addRec1";
    }
    @RequestMapping("/addRec")
    public String addRec(){
        return "addRec";
    }
    //删除招聘信息
    @RequestMapping("/deleteRec")
    public String deleteRec(Recruitment recruitment,HttpSession session){
        recruitmentService.deleteRecruitment(recruitment);
        return "admin";
    }
    //修改招聘信息
    @RequestMapping("updateRec1")
    public String updateRec1(Recruitment recruitment,HttpSession session){
        Recruitment recruitment1=recruitmentService.getRecruitmentById(recruitment);
        session.setAttribute("recruitment1",recruitment1);
        return "updateRec";
    }
    @RequestMapping("/updateRec")
    public  String updateRec(Recruitment recruitment, HttpSession session){
        Recruitment recruitment1= (Recruitment) session.getAttribute("recruitment1");
        recruitment.setId(recruitment1.getId());
        recruitmentService.updateRecruitment(recruitment);
        return "aRec";
    }


}
