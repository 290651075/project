package com.lx.service.impl;

import com.lx.dao.PositionMapper;
import com.lx.model.Position;
import com.lx.service.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public List<Position> getPosition(Position position) {
        return positionMapper.getPosition(position);
    }

    @Override
    public void deleteP(Position position) {
        positionMapper.deleteP(position);
    }

    @Override
    public void addP(Position position) {
        positionMapper.addP(position);
    }

    @Override
    public void deletePById(Position position) {
        deletePById(position);
    }

    @Override
    public Position getPByName(Position position) {
        return positionMapper.getPByName(position);
    }
}
