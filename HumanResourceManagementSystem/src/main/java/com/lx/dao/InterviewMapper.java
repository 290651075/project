package com.lx.dao;

import com.lx.model.Interview;
import com.lx.model.Tourist;

import java.util.List;

/**
 * Created by Administrator on 2018/7/26.
 */
public interface InterviewMapper {
    //查出该游客所有已邀请参加面试游客未确认是否参加的面试邀请信息 1 0
    List<Interview> getInterviewByT(Interview interview);
    //游客确认是否参加面试，修改invitestate
    void updateInterview(Interview interview);
    //管理员邀请参加面试
    void addInterview(Interview interview);
    //查出所有接受面试邀请的游客
    List<Interview> getInterivew(Interview interview);
    //修改面试结果
    void updateInterviewR(Interview interview);
    //游客查询面试结果
    List<Interview> getInterviewRByT(Interview interview);
    //通过id查询面试信息
    Interview getInterviewById(Interview interview);
}
