package com.lx.service;

import com.lx.model.Tourist;

/**
 * Created by Administrator on 2018/7/25.
 */
public interface TouristService {
    //游客登录
    Tourist getTourist(Tourist tourist);
    //游客注册
    void addTourist(Tourist tourist);
}
