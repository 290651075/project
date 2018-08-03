package com.lx.service.impl;

import com.lx.dao.TrainingMapper;
import com.lx.model.Training;
import com.lx.service.TrainingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/8/2.
 */
@Service
public class TrainingServiceImpl implements TrainingService {
    @Resource
    private TrainingMapper trainingMapper;

    @Override
    public List<Training> getTR() {
        return trainingMapper.getTR();
    }

    @Override
    public List<Training> getTRByPage(int begin, int end) {
        return trainingMapper.getTRByPage(begin,end);
    }

    @Override
    public void addTR(Training training) {
        trainingMapper.addTR(training);
    }

    @Override
    public void addTR1(int EIid, int TRid) {
        trainingMapper.addTR1(EIid,TRid);
    }

    @Override
    public void updateTR(Training training) {
        trainingMapper.updateTR(training);
    }

    @Override
    public void revokeTR(Training training) {
        trainingMapper.revokeTR(training);
    }

    @Override
    public Training getTRById(Training training) {
        return trainingMapper.getTRById(training);
    }
}
