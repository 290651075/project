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
    public Department getDepartmentById(Department department) {
        return departmentMapper.getDepartmentById(department);
    }

    @Override
    public List<Department> getDepartment() {
        return departmentMapper.getDepartment();
    }

    @Override
    public Department getDepartmentByName(Department department) {
        return departmentMapper.getDepartmentByName(department);
    }

    @Override
    public void addDepartment(Department department) {
        departmentMapper.addDepartment(department);
    }

    @Override
    public void updateDpByName(Department department) {
        departmentMapper.updateDpByName(department);
    }

    @Override
    public void deleteDp(Department department) {
        departmentMapper.deleteDp(department);
    }
}
