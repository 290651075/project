package com.lx.service.impl;

import com.lx.dao.InterviewMapper;
import com.lx.model.Interview;
import com.lx.model.Tourist;
import com.lx.service.InterviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/7/26.
 */
@Service
public class InterviewServiceImpl implements InterviewService{
    @Resource
    private InterviewMapper interviewMapper;
    @Override
    public List<Interview> getInterviewByT(int state, Tourist tourist) {
        return interviewMapper.getInterviewByT(state,tourist);
    }

    @Override
    public void updateInterview(Interview interview) {
        updateInterview(interview);
    }
}
