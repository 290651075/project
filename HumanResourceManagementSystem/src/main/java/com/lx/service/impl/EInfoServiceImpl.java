package com.lx.service.impl;

import com.lx.dao.EInfoMapper;
import com.lx.model.EInfo;
import com.lx.service.EInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/8/1.
 */
@Service
public class EInfoServiceImpl implements EInfoService {
    @Resource
    private EInfoMapper eInfoMapper;
    @Override
    public List<EInfo> getEInfoByD(EInfo eInfo) {
        return eInfoMapper.getEInfoByD(eInfo);
    }

    @Override
    public List<EInfo> getEInfoByDAndPage(int dId, int begin, int end) {
        return eInfoMapper.getEInfoByDAndPage(dId,begin,end);
    }

    @Override
    public List<EInfo> getEInfoByP(EInfo eInfo) {
        return eInfoMapper.getEInfoByP(eInfo);
    }

    @Override
    public List<EInfo> getEInfoByPAndPage(int pId, int begin, int end) {
        return eInfoMapper.getEInfoByPAndPage(pId,begin,end);
    }

    @Override
    public EInfo getEInfoById(EInfo eInfo) {
        return eInfoMapper.getEInfoById(eInfo);
    }

    @Override
    public void addEInfo(EInfo eInfo) {
        eInfoMapper.addEInfo(eInfo);
    }
}
