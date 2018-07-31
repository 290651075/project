package com.lx.service.impl;

import com.lx.dao.ResAndRecMapper;
import com.lx.model.Recruitment;
import com.lx.model.ResAndRec;
import com.lx.model.Resume;
import com.lx.service.ResAndRecService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/7/26.
 */
@Service
public class ResAndRecServiceImpl implements ResAndRecService{
    @Resource
    private ResAndRecMapper resAndRecMapper;

    @Override
    public void addResAndRec(ResAndRec resAndRec) {
        resAndRecMapper.addResAndRec( resAndRec);
    }

    @Override
    public List<ResAndRec> getAllResAndRec() {
        return resAndRecMapper.getAllResAndRec();
    }

    @Override
    public ResAndRec getResAndRecById(ResAndRec resAndRec) {
        return resAndRecMapper.getResAndRecById(resAndRec);
    }

    @Override
    public void deleteResAndRecById(ResAndRec resAndRec) {
        resAndRecMapper.deleteResAndRecById(resAndRec);
    }
}
