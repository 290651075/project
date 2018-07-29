package com.lx.controller;

import com.lx.model.Resume;
import com.lx.model.Tourist;
import com.lx.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/7/26.
 */
@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;
    //分页显示简历名
    @RequestMapping("/lookResume")
    public String getlookResume(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, HttpSession session){
        Tourist tourist= (Tourist) session.getAttribute("tourist");
    /*    System.out.println("****************");
        System.out.println(tourist);*/
        int tId=tourist.getId();
        List<Resume> resumes=resumeService.getResume(tourist);
        int totalNum=resumes.size();
        int pageSize=5;
        int totalPages=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<Resume> resumes1=resumeService.getResumeByTIdAndPage(tId,begin,end);
        session.setAttribute("resumes",resumes1);
        session.setAttribute("totalPages1",totalPages);
        return "listResume";
    }
    //显示查看的简历的具体内容
    @RequestMapping("/listResumeDetail")
    public String getResumeDetail(Resume resume,Model model, HttpSession session){
        /*System.out.println(resume);*/
        Resume resume1=resumeService.getResumeById(resume);
        /*System.out.println(resume1);*/
        session.setAttribute("resume",resume1);
        return "listResumeDetail";
    }
    //添加简历
    @RequestMapping("/addResume")
    public String addResume(Resume resume,HttpSession session){
        System.out.println(resume);
        resumeService.addResume(resume);
        return "success";
    }
    //用于跳转jsp
    @RequestMapping("/addResume1")
    public String addResume1(){
        return "addResume";
    }
}
