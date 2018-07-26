package com.lx.controller;

import com.lx.service.ResumeService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/7/26.
 */
@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;

}
