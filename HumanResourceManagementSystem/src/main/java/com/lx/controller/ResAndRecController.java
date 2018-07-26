package com.lx.controller;

import com.lx.service.ResAndRecService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/7/26.
 */
@Controller
public class ResAndRecController {
    @Resource
    private ResAndRecService resAndRecService;

}
