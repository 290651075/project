package com.lx.controller;

import com.lx.model.Department;
import com.lx.model.Position;
import com.lx.service.EInfoService;
import com.lx.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/7/30.
 */
@Controller
public class PositionController {
    @Resource
    private PositionService positionService;
    @Resource
    private EInfoService eInfoService;
    //增加职位
    @RequestMapping("/addPo")
    public String addPo(){
        return "addPo";
    }
    @RequestMapping("/addPo1")
    public String addPo(Position position, HttpSession session, HttpServletRequest request){
        if(positionService.getPByName(position)!=null){
            request.setAttribute("error","已存在该职位");
            return "addPo";
        }
        Department department= (Department) session.getAttribute("departmentP");
        position.setDepartment(department);
        positionService.addP(position);
        return "addPo";
    }
}
