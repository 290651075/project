package com.lx.controller;

import com.lx.model.Recruitment;
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
/*    @RequestMapping("/")
    public String attendInterview(HttpSession session){
        Recruitment recruitment= (Recruitment) session.getAttribute("recruitment");
        Resume resume= (Resume) session.getAttribute("resume");
        resAndRecService.addResAndRec(recruitment.getId(),resume.getId());
        return "/tt";
    }*/

}
