package com.lx.controller;

import com.lx.model.Resume;
import com.lx.model.Tourist;
import com.lx.service.ResumeService;
import org.springframework.stereotype.Controller;
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
    @RequestMapping("lookResume")
    public String getlookResume(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, HttpSession session){
        Tourist tourist= (Tourist) session.getAttribute("tourist");
    /*    System.out.println("****************");
        System.out.println(tourist);*/
        List<Resume> resumes=resumeService.getResume(tourist);
        int totalNum=resumes.size();
        int pageSize=5;
        int totalPages=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<Resume> resumes1=resumeService.getResumeByTIdAndPage(tourist,begin,end);
        session.setAttribute("resumes",resumes1);
        session.setAttribute("totalPages1",totalPages);
        return "listResume";
    }
}
