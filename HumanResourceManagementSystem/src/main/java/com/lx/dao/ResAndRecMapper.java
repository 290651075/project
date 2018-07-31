package com.lx.dao;

import com.lx.model.Recruitment;
import com.lx.model.ResAndRec;
import com.lx.model.Resume;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/7/26.
 */
public interface ResAndRecMapper {
    //成功投递简历
    void addResAndRec(ResAndRec resAndRec );
    //管理员查询投递成功的简历
    List<ResAndRec> getAllResAndRec();
    //通过id查
    ResAndRec getResAndRecById(ResAndRec resAndRec);
    //删除
    void deleteResAndRecById(ResAndRec resAndRec);
}
