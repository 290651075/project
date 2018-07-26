package com.lx.dao;

import com.lx.model.Recruitment;

import java.util.List;

/**
 * Created by Administrator on 2018/7/25.
 */
public interface RecruitmentMapper {
    //获取所有发布的招聘信息
    List<Recruitment> getRecruitmentByState(int state);
    //对招聘信息分页
    List<Recruitment> getRecruitmentByStateAndPage(int state,int begin,int end);
}
