package com.lx.service;

import com.lx.model.Training;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface TrainingService {
    List<Training> getTR();
    List<Training> getTRByPage(int begin,int end);
    void  addTR(Training training);
    void addTR1(int EIid,int TRid);
    void updateTR(Training training);
    void revokeTR(Training training);
    Training getTRById(Training training);
}
