package com.lx.service;

import com.lx.model.Position;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface PositionService {
    Position getPositionById(Position position);
    List<Position> getPosition(Position position);
    void deleteP(Position position);
    void addP(Position position);
    void deletePById(Position position);
    Position getPByName(Position position);
    void updatePById(Position position);
}
