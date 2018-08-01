package com.lx.dao;

import com.lx.model.Department;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface DepartmentMapper {
    //通过id查询部门名称
    Department getDepartmentById(Department department);
    //查询所有部门
    List<Department> getDepartment();
    //根据名字查询部门
    Department getDepartmentByName(Department department);
    //添加部门
    void addDepartment(Department department);
    //修改部门名称
    void updateDpByName(Department department);
    //删除部门
    void deleteDp(Department department);
}
