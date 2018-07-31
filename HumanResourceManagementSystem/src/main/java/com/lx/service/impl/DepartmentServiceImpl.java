package com.lx.service.impl;

import com.lx.dao.DepartmentMapper;
import com.lx.model.Department;
import com.lx.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;
    @Override
    public Department getDepartmentById(int dId) {
        return departmentMapper.getDepartmentById(dId);
    }

    @Override
    public List<Department> getDepartment() {
        return departmentMapper.getDepartment();
    }
}
