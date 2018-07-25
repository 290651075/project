package com.lx.service.impl;

import com.lx.dao.TouristMapper;
import com.lx.model.Tourist;
import com.lx.service.TouristService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/7/25.
 */
@Service
public class TouristServiceImpl implements TouristService{
    @Resource
    private TouristMapper touristMapper;

    @Override
    public Tourist getTourist(Tourist tourist) {
        return touristMapper.getTourist(tourist);
    }

    @Override
    public void addTourist(Tourist tourist) {
        touristMapper.addTourist(tourist);
    }
}
