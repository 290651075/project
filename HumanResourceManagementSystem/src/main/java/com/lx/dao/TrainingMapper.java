package com.lx.dao;

import com.lx.model.Training;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface  TrainingMapper {
    //查出所有培训信息
    List<Training> getTR();
    //对培训信息分页
    List<Training> getTRByPage(int begin,int end);
    //添加培训
    void  addTR(Training training);
    //添加进多对多中间表
    void addTR1(int EIid,int TRid);
    //修改培训内容
    void updateTR(Training training);
    //撤回培训
    void revokeTR(Training training);
    //通过id查培训neir
    Training getTRById(Training training);

}
