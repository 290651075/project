package com.lx.controller;

import com.lx.model.Recruitment;
import com.lx.model.ResAndRec;
import com.lx.model.Resume;
import com.lx.model.Tourist;
import com.lx.service.ResAndRecService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/7/26.
 */
@Controller
public class ResAndRecController {
    @Resource
    private ResAndRecService resAndRecService;
    //投递简历
    @RequestMapping("submitRes1")
    public String submitResume(Resume resume,HttpSession session){
        Recruitment recruitment= (Recruitment) session.getAttribute("recruitment");
        ResAndRec resAndRec=new ResAndRec(resume,recruitment);
        resAndRecService.addResAndRec(resAndRec);
        return "success";
    }

}
