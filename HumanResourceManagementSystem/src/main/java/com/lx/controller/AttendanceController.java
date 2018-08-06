package com.lx.controller;

import com.lx.service.AttendanceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/7/30.
 */
@Controller
public class AttendanceController {
   @@Resource
    private AttendanceService attendanceService;
   @RequestMapping("/goWork")
    public String goWork(){

   }
}
