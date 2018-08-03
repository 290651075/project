package com.lx.controller;

import com.lx.model.EInfo;
import com.lx.service.EInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/7/30.
 */
@Controller
public class EInfoController {
    @Resource
    private EInfoService eInfoService;
    @RequestMapping("/listEIfoDetail")
    public String listEIfoDetail(EInfo eInfo, HttpSession session){
        EInfo eInfo1=eInfoService.getEInfoById(eInfo);
        session.setAttribute("PEm",eInfo1);
        return "listEIfoDetail";
    }
}
