package com.lx.dao;

import com.lx.model.EInfo;
import com.lx.model.Employee;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface EInfoMapper {
    //查询某职位下的员工
    List<EInfo> getEInfoByP(EInfo eInfo);
    //查询某部门下的员工
    List<EInfo> getEInfoByD(EInfo eInfo);
    //分页查询某部门下的员工
    List<EInfo>  getEInfoByDAndPage(int dId,int begin, int end);
    //分页查询某职位吓得员工
    List<EInfo>  getEInfoByPAndPage(int pId,int begin, int end);
    //通过id查询员工
    EInfo getEInfoById(EInfo eInfo);

}
