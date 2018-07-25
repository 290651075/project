package com.lx.controller;

import com.lx.model.Tourist;
import com.lx.service.TouristService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/7/25.
 */
@Controller
public class TouristController {
    @Resource
    private TouristService touristService;
    //游客登录
    @RequestMapping("/login")
    public String login(Tourist tourist ,HttpSession session ) throws Exception{
        Tourist tourist1=touristService.getTourist(tourist);
      /*  System.out.println(tourist);
        System.out.println("********");*/
        System.out.println(tourist1);
        if (null!=tourist1){
            session.setAttribute("t",tourist1);
            return "success";
        }
        return "../../index";
    }
    @RequestMapping("/register1")
    public String register1(){
        return "register";
    }
    @RequestMapping("register")
    public String register(Tourist tourist,HttpSession session){
        touristService.addTourist(tourist);
        session.setAttribute("t",tourist);
        return "../../index";
    }
}
