package com.lx.service;

import com.lx.model.Interview;
import com.lx.model.Tourist;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/7/26.
 */
public interface InterviewService {
    List<Interview> getInterviewByT(Interview interview);
    void updateInterview(Interview interview);
    void addInterview(Interview interview);
}
