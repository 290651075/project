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
}
