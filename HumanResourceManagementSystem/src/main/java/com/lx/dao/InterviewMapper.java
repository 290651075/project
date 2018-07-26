package com.lx.dao;

import com.lx.model.Interview;
import com.lx.model.Tourist;

import java.util.List;

/**
 * Created by Administrator on 2018/7/26.
 */
public interface InterviewMapper {
    //查出该游客所有已邀请参加面试游客未确认是否参加的面试邀请信息
    List<Interview> getInterviewByT(int state,Tourist tourist);
    //游客确认是否参加面试，修改state
    void updateInterview(Interview interview);
}
