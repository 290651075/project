package com.lx.controller;

import com.lx.model.Department;
import com.lx.model.Position;
import com.lx.service.DepartmentService;
import com.lx.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
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
    @RequestMapping("/getDp")
    public String getDp(HttpSession session){
        List<Department> departments=departmentService.getDepartment();
        session.setAttribute("departments",departments);
        return "getDp";
    }
    //查询某部门下的职位(未进行非空判断)
    @RequestMapping("/getPo")
    public String getPo(Department department,HttpSession session){
        Position position=new Position(department);
        List<Position> positions=positionService.getPosition(position);
        session.setAttribute("positions",positions);
        return "getPo";
    }
}
