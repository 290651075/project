package com.lx.dao;

import com.lx.model.Position;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface PositionMapper {
    //通过id得到职位
    Position getPositionById(int pId);
}
