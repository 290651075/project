package com.lx.dao;

import com.lx.model.Recruitment;
import com.lx.model.Resume;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2018/7/26.
 */
public interface ResAndRecMapper {
    //成功投递简历
    void addResAndRec(int recId, int resId );
}
