package com.lx.controller;

import com.lx.service.InterviewService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/7/26.
 */
@Controller
public class InterviewController {
    @Resource
    private InterviewService interviewService;
}
