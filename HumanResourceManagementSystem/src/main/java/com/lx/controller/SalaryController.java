package com.lx.controller;

import com.lx.service.SalaryService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.lang.ref.PhantomReference;

/**
 * Created by Administrator on 2018/7/30.
 */
@Controller
public class SalaryController {
    @Resource
    private SalaryService salaryService;

}
