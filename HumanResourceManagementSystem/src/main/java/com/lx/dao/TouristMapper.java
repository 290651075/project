package com.lx.dao;


import com.lx.model.Tourist;

public interface TouristMapper {
    //游客登录
    Tourist getTourist(Tourist tourist);
    //游客注册
    void addTourist(Tourist tourist);
}
