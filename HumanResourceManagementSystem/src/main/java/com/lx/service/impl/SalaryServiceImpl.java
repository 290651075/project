package com.lx.service.impl;

import com.lx.dao.SalaryMapper;
import com.lx.service.SalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/8/3.
 */
@Service
public class SalaryServiceImpl implements SalaryService {
    @Resource
    private SalaryMapper salaryMapper;
}
