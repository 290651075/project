package com.lx.dao;

import com.lx.model.Position;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface PositionMapper {
    //通过id得到职位
    Position getPositionById(int pId);
    //查询某部门下的职位
    List<Position> getPosition(Position position);
}
