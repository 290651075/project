package com.lx.controller;

import com.lx.model.Recruitment;
import com.lx.model.ResAndRec;
import com.lx.model.Resume;
import com.lx.model.Tourist;
import com.lx.service.RecruitmentService;
import com.lx.service.ResAndRecService;
import com.lx.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @Resource
    private ResAndRecService resAndRecService;
    @Resource
    private RecruitmentService recruitmentService;
    //分页显示简历名
    @RequestMapping("/lookResume")
    public String getlookResume(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, HttpSession session){
        Tourist tourist= (Tourist) session.getAttribute("tourist");
        int tId=tourist.getId();
        List<Resume> resumes=resumeService.getResume(tourist);
        if(resumes.size()==0){
            return "noResume";
        }else{
            int totalNum=resumes.size();
            int pageSize=5;
            int totalPages=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
            int begin = (currentPage-1)*pageSize+1;
            int end = (currentPage-1)*pageSize+pageSize;
            List<Resume> resumes1=resumeService.getResumeByTIdAndPage(tId,begin,end);
            session.setAttribute("resumes",resumes1);
            session.setAttribute("totalPages1",totalPages);
            return "listResume";
        }
    }
    //显示查看的简历的具体内容
    @RequestMapping("/listResumeDetail")
    public String getResumeDetail(Resume resume,Model model, HttpSession session){
        Resume resume1=resumeService.getResumeById(resume);
        session.setAttribute("resume",resume1);
        return "listResumeDetail";
    }
    //管理员显示查看的简历的具体内容
    @RequestMapping("/listResumeDetail1")
    public String getResumeDetail1(Resume resume,Model model, HttpSession session){
        Resume resume1=resumeService.getResumeById(resume);
        session.setAttribute("resumeAd",resume1);
        return "listResumeDetailAd";
    }
    //添加简历
    @RequestMapping("/addResume")
    public String addResume(Resume resume,HttpSession session){
        Tourist tourist= (Tourist) session.getAttribute("tourist");
        resume.setTourist(tourist);
        resumeService.addResume(resume);
        return "success";
    }
    //用于跳转jsp
    @RequestMapping("/addResume1")
    public String addResume1(){
        return "addResume";
    }
    //返回页面
    @RequestMapping("/return")
    public String return1(){
        return "listResume";
    }
    //提交简历跳转到选择
    @RequestMapping("/submitRes")
    public String subResume(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, Recruitment recruitment, HttpSession session) {
        Tourist tourist = (Tourist) session.getAttribute("tourist");
        if (tourist == null) {
            return "noTourist";
        }
        int tId = tourist.getId();
        List<Resume> resumes = resumeService.getResume(tourist);
        if (resumes.size() == 0) {
            return "noResume";
        } else {
            int totalNum = resumes.size();
            int pageSize = 5;
            int totalPages = totalNum % pageSize == 0 ? totalNum / pageSize : totalNum / pageSize + 1;
            int begin = (currentPage - 1) * pageSize + 1;
            int end = (currentPage - 1) * pageSize + pageSize;
            List<Resume> resumes1 = resumeService.getResumeByTIdAndPage(tId, begin, end);
            session.setAttribute("resumes2", resumes1);
            session.setAttribute("totalPages2", totalPages);
            session.setAttribute("recruitment",recruitment);
            return "chooseResume";
        }
    }

    //返回登录成功界面
    @RequestMapping("/backing")
    public String backingOut(){
        return "success";
    }
    //跳转修改界面
    @RequestMapping("/updateResume1")
    public String updateResume(Resume resume,HttpSession session){
        Resume resume1=resumeService.getResumeById(resume);
        session.setAttribute("resume1",resume1);
        return "updateResume";
    }
    //修改成功跳转界面
    @RequestMapping("/updateResumeDetail")
    public String updateResume1(Resume resume,HttpSession session){
        Resume resume1= (Resume) session.getAttribute("resume1");
        resume.setId(resume1.getId());
        resumeService.updateResume(resume);
        return "success";
    }
    //删除简历
    @RequestMapping("deleteResume")
    public String deleteRes(Resume resume){
        resumeService.deleteResume(resume);
        return "success";
    }
    //管理员查看简历
    @RequestMapping("getAllRes")
    public String getAllRes(HttpSession session){
        List<ResAndRec> resAndRecs=resAndRecService.getAllResAndRec();
        for(int i=0;i<resAndRecs.size();i++){
            Recruitment recruitment=recruitmentService.getRecruitmentById(resAndRecs.get(i).getRecruitment());
            Resume resume=resumeService.getResumeById(resAndRecs.get(i).getResume());
            resAndRecs.get(i).setRecruitment(recruitment);
            resAndRecs.get(i).setResume(resume);
        }
        session.setAttribute("resAndRecs",resAndRecs);
        return "adminResAndRec";
    }
    @RequestMapping("/adReturn")
    public String adReturn(){
        return "adminResAndRec";
    }
}
