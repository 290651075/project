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
    public List<Interview> getInterviewByT(Interview interview) {
        return interviewMapper.getInterviewByT(interview);
    }

    @Override
    public void updateInterview(Interview interview) {
        interviewMapper.updateInterview(interview);
    }

    @Override
    public void addInterview(Interview interview) {
        interviewMapper.addInterview(interview);
    }

    @Override
    public List<Interview> getInterivew(Interview interview) {
        return interviewMapper.getInterivew(interview);
    }

    @Override
    public void updateInterviewR(Interview interview) {
        interviewMapper.updateInterviewR(interview);
    }

    @Override
    public Interview getInterviewById(Interview interview) {
        return interviewMapper.getInterviewById(interview);
    }

    @Override
    public List<Interview> getInterviewRByT(Interview interview) {
        return interviewMapper.getInterviewRByT(interview);
    }
}
