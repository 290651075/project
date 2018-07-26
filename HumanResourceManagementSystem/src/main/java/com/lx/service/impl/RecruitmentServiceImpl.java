package com.lx.service.impl;

import com.lx.dao.RecruitmentMapper;
import com.lx.model.Recruitment;
import com.lx.service.RecruitmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/7/25.
 */
@Service
public class RecruitmentServiceImpl implements RecruitmentService {
    @Resource
    private RecruitmentMapper recruitmentMapper;

    @Override
    public List<Recruitment> getRecruitmentByState(int state) {
        return recruitmentMapper.getRecruitmentByState(state);
    }

    @Override
    public List<Recruitment> getRecruitmentByStateAndPage(int state, int begin, int end) {
        return recruitmentMapper.getRecruitmentByStateAndPage(state,begin,end);
    }
}
