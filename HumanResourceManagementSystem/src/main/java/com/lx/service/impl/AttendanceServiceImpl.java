package com.lx.service.impl;

import com.lx.dao.AttendanceMapper;
import com.lx.service.AttendanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/8/6.
 */
@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Resource
    private AttendanceMapper attendanceMapper;
}
