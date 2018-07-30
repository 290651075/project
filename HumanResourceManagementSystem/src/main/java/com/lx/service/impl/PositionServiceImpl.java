package com.lx.service.impl;

import com.lx.dao.PositionMapper;
import com.lx.model.Position;
import com.lx.service.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/7/30.
 */
@Service
public class PositionServiceImpl implements PositionService {
    @Resource
    private PositionMapper positionMapper;

    @Override
    public Position getPositionById(int pId) {
        return positionMapper.getPositionById(pId);
    }
}
