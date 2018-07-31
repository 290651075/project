package com.lx.service;

import com.lx.model.Recruitment;
import com.lx.model.ResAndRec;
import com.lx.model.Resume;

import java.util.List;

/**
 * Created by Administrator on 2018/7/26.
 */
public interface ResAndRecService {
    void addResAndRec(ResAndRec resAndRec );
    List<ResAndRec> getAllResAndRec();
    ResAndRec getResAndRecById(ResAndRec resAndRec);
    void deleteResAndRecById(ResAndRec resAndRec);
}
