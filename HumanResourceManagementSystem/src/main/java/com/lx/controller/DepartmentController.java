package com.lx.controller;

import com.lx.model.Department;
import com.lx.model.EInfo;
import com.lx.model.Position;
import com.lx.model.Recruitment;
import com.lx.service.DepartmentService;
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
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;
    @Resource
    private PositionService positionService;
    @Resource
    private EInfoService eInfoService;
    @RequestMapping("/getDp")
    public String getDp(HttpSession session){
        List<Department> departments=departmentService.getDepartment();
        session.setAttribute("departments",departments);
        return "getDp";
    }
    //查询某部门下的职位(未进行非空判断)
    @RequestMapping( "/getPo")
    public String getPo(Department department,HttpSession session){
        Position position=new Position(department);
        List<Position> positions=positionService.getPosition(position);
        session.setAttribute("departmentP",department);
        session.setAttribute("positions",positions);
        return "getPo";
    }
    //跳转
    @RequestMapping("/addDp")
    public String addDp(){
        return "addDp";
    }
    //添加部门
    @RequestMapping("/addDp1")
    public String addDp1(Department department, HttpServletRequest request){
        if (departmentService.getDepartmentByName(department)!=null){
           request.setAttribute("error","已存在该部门");
           return "addDp";
        }
        departmentService.addDepartment(department);
        return "addDp";
    }
    //修改部门名
    @RequestMapping("/updateDp")
    public String updateDp(Department department,HttpSession session){
        Department department1=departmentService.getDepartmentById(department);
        session.setAttribute("department",department1);
        return "updateDp";
    }
    @RequestMapping("/updateDp1")
    public String updateDp1(Department department,HttpSession session,HttpServletRequest request){
        Department department1= (Department) session.getAttribute("department");
        if(departmentService.getDepartmentByName(department)!=null){
            request.setAttribute("error1","已存在该部门或与修改的部门重名");
            return "updateDp";
        }
        department.setId(department1.getId());
        departmentService.updateDpByName(department);
        return "updateDp";
    }
    //删除部门
    @RequestMapping("/deleteDp")
    public String deleteDp(Department department,HttpServletRequest request,HttpSession session){
        EInfo eInfo=new EInfo(department);
        List<EInfo> eInfos=eInfoService.getEInfoByD(eInfo);
        if(eInfos.size()!=0){
            request.setAttribute("error2","该部门下仍有员工，不能删除");
            return "getDp";
        }
        Position position=new Position(department);
        positionService.deleteP(position);
        departmentService.deleteDp(department);
        return getDp(session);
    }
    //查询部门下所有员工
    @RequestMapping("getDE")
    public String getDE(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, HttpSession session,Department department){
        int dId=department.getId();
        EInfo eInfo=new EInfo(department);
        List<EInfo> eInfos=eInfoService.getEInfoByD(eInfo);
        int totalNum=eInfos.size();
        int pageSize=1;
        int totalPages=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<EInfo> eInfos1=eInfoService.getEInfoByDAndPage(dId,begin,end);
        session.setAttribute("eInfosDE",eInfos1);
        session.setAttribute("totalPagesDE",totalPages);
        return "getDE";
    }
}
