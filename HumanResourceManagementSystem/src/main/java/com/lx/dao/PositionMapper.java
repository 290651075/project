package com.lx.dao;

import com.lx.model.Position;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface PositionMapper {
    //通过id得到职位
    Position getPositionById(Position position);
    //查询某部门下的职位
    List<Position> getPosition(Position position);
    //删除某部门下的职位
    void deleteP(Position position);
    //添加职位
    void addP(Position position);
    //通过id删除职位
    void deletePById(Position position);
    //根据名字查询职位
    Position getPByName(Position position);
    //修改职位名称
    void updatePById(Position position);
}
