package com.lx.service;

import com.lx.model.Department;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface DepartmentService {
    Department getDepartmentById(int dId);
    List<Department> getDepartment();
}
