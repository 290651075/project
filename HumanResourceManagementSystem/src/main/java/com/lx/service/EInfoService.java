package com.lx.service;

import com.lx.model.EInfo;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface EInfoService {
    List<EInfo> getEInfoByD(EInfo eInfo);
    List<EInfo>  getEInfoByDAndPage(int dId,int begin, int end);
    List<EInfo> getEInfoByP(EInfo eInfo);
    List<EInfo>  getEInfoByPAndPage(int pId,int begin, int end);
    EInfo getEInfoById(EInfo eInfo);
    void addEInfo(EInfo eInfo);

}
