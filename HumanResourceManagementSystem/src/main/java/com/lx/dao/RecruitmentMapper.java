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
    //增加招聘信息
    void addRecruitment(Recruitment recruitment);
    //删除招聘信息
    void deleteRecruitment(Recruitment recruitment);
    //修改招聘信息
    void updateRecruitment(Recruitment recruitment);
    //查询所有招聘信息
    List<Recruitment> getAllRecruitment(int begin,int end);
    //获取所有招聘信息
    List<Recruitment> getRecruitment();
    //通过id查询招聘信息
    Recruitment getRecruitmentById(Recruitment recruitment);
}
