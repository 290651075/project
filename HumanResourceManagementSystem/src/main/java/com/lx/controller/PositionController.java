package com.lx.controller;

import com.lx.model.Department;
import com.lx.model.EInfo;
import com.lx.model.Position;
import com.lx.service.EInfoService;
import com.lx.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

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
    //删除职位
    @RequestMapping("/deletePo")
    public String deletePo(Position position,HttpServletRequest request){
        EInfo eInfo=new EInfo(position);
        List<EInfo> eInfos=eInfoService.getEInfoByP(eInfo);
        if(eInfos.size()!=0){
            request.setAttribute("error","该职位下还有员工");
            return "getPo";
        }
        positionService.deletePById(position);
        return "getDp";
    }
    //查询在职位下的所有员工
    @RequestMapping("/getPEm")
    public String getPEm(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage,HttpSession session, Position position){
        int pId=position.getId();
        EInfo eInfo=new EInfo(position);
        List<EInfo> eInfos=eInfoService.getEInfoByP(eInfo);
        int totalNum=eInfos.size();
        int pageSize=1;
        int totalPages=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<EInfo> eInfos1=eInfoService.getEInfoByPAndPage(pId,begin,end);
        session.setAttribute("eInfosPE",eInfos1);
        session.setAttribute("totalPagesPE",totalPages);
        return "getPEm";
    }
    //修改职位
    @RequestMapping("/updatePo")
    public String updatePo(Position position,HttpSession session){
        Position position1=positionService.getPositionById(position);
        session.setAttribute("position",position1);
        return "updatePo";
    }
    @RequestMapping("/updatePo1")
    public String updatePo1(Position position,HttpSession session,HttpServletRequest request){
        Position position1= (Position) session.getAttribute("position");
        if(positionService.getPByName(position)!=null){
            request.setAttribute("error1","已存在该职位或与修改的职位重名");
            return "updatePo";
        }
        position.setId(position1.getId());
        positionService.updatePById(position);
        return "updatePo";
    }
}
