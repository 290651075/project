package com.lx.dao;

import com.lx.model.Department;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface DepartmentMapper {
    //通过id查询部门名称
    Department getDepartmentById(int dId);
}
