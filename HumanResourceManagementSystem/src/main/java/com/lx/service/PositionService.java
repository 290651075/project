package com.lx.service;

import com.lx.model.Position;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface PositionService {
    Position getPositionById(int pId);
    List<Position> getPosition(Position position);
}
