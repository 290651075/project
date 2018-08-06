package com.lx.dao;

import com.lx.model.Attendance;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface AttendanceMapper {
    //上班打卡
    void addAT(Attendance attendance);
    //修改考勤（下班打卡，迟到早退等）
    void updateAT(Attendance attendance);

}
