package com.lx.service;

import com.lx.model.Recruitment;

import java.util.List;

/**
 * Created by Administrator on 2018/7/25.
 */
public interface RecruitmentService {
    List<Recruitment> getRecruitmentByState(int state);
    List<Recruitment> getRecruitmentByStateAndPage(int state,int begin,int end);
    void addRecruitment(Recruitment recruitment);
    void deleteRecruitment(Recruitment recruitment);
    void updateRecruitment(Recruitment recruitment);
}
