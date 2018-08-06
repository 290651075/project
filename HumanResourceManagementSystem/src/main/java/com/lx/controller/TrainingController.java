package com.lx.controller;

import com.lx.model.Department;
import com.lx.model.EInfo;
import com.lx.model.Training;
import com.lx.service.DepartmentService;
import com.lx.service.EInfoService;
import com.lx.service.RecruitmentService;
import com.lx.service.TrainingService;
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
public class TrainingController {
    @Resource
    private TrainingService trainingService;
    @Resource
    private DepartmentService departmentService;
    @Resource
    private EInfoService eInfoService;
    //查询培训信息并分页
    @RequestMapping("/getTR")
    public String getTR(@RequestParam(value = "currentPage",defaultValue = "1") int currentPage, HttpSession session){
        List<Training> trainings=trainingService.getTR();
        int totalNum=trainings.size();
        int pageSize=1;
        int totalPages=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<Training> trainings1=trainingService.getTRByPage(begin,end);
        session.setAttribute("trainings",trainings1);
        session.setAttribute("totalPagesTR",totalPages);
        return "getTR";
    }
    //添加培训
    @RequestMapping("/addTR")
    public String addTR(){
        return "addTR";
    }
    //选择部门
    @RequestMapping("/addTR1")
    public String addTR1(Training training,HttpSession session){
        List<Department> departments=departmentService.getDepartment();
        session.setAttribute("departmentsTR",departments);
        session.setAttribute("trainingAdd",training);
        return "chooseDp";
    }
    //选择是否发布
    @RequestMapping("/chooseIS")
    public String chooseIS(Department department, HttpSession session, HttpServletRequest request){
        EInfo eInfo=new EInfo(department);
        List<EInfo> eInfos=eInfoService.getEInfoByD(eInfo);
        if(eInfos.size()==0){
            request.setAttribute("error","该部门下没有员工");
            return "chooseDp";
        }
        session.setAttribute("departmentTR",department);
        return "chooseIs";
    }
    @RequestMapping("/chooseIS1")
    public String chooseIS1(Training training,HttpSession session){
        Training training1= (Training) session.getAttribute("trainingAdd");
        Department department= (Department) session.getAttribute("departmentTR");
        EInfo eInfo=new EInfo(department);
        List<EInfo> eInfos=eInfoService.getEInfoByD(eInfo);
        training1.setState(training.getState());
        trainingService.addTR(training1);
        for (int i=0;i<eInfos.size();i++){
            trainingService.addTR1(eInfos.get(i).getId(),training1.getId());
        }
        return "admin";
    }
    //修改培训
    @RequestMapping("/updateTR")
    public String updateTR(Training training,HttpSession session){
        Training training1=trainingService.getTRById(training);
        System.out.println("@@@@@@@@");
        System.out.println(training1);
        session.setAttribute("training",training1);
        return "updateTR";
    }
    @RequestMapping("/updateTR1")
    public String updateTR1(Training training,HttpSession session){
        Training training1= (Training) session.getAttribute("training");
        training.setId(training1.getId());
        trainingService.updateTR(training);
        return "admin";
    }
    //撤回
  /*  @RequestMapping("/revokeTR")
    public String revokeTR(Training training){
        return "ff";
    }*/
}
