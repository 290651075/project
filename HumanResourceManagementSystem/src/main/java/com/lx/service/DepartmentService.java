package com.lx.service;

import com.lx.model.Department;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface DepartmentService {
    Department getDepartmentById(Department department);
    List<Department> getDepartment();
    Department getDepartmentByName(Department department);
    void addDepartment(Department department);
    void updateDpByName(Department department);
    void deleteDp(Department department);
}
