package com.lx.service.impl;

import com.lx.dao.ResAndRecMapper;
import com.lx.model.Recruitment;
import com.lx.model.Resume;
import com.lx.service.ResAndRecService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/7/26.
 */
@Service
public class ResAndRecServiceImpl implements ResAndRecService{
    @Resource
    private ResAndRecMapper resAndRecMapper;

    @Override
    public void addResAndRec(int recId, int resId) {
        resAndRecMapper.addResAndRec(recId,resId);
    }
}
