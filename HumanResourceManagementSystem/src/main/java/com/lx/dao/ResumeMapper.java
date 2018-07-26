package com.lx.dao;

import com.lx.model.Resume;
import com.lx.model.Tourist;

import java.util.List;

/**
 * Created by Administrator on 2018/7/26.
 */
public interface ResumeMapper {
     //列出该游客的所有简历
     List<Resume> getResume(Tourist tourist);
     //添加新简历
     void addResume(Resume resume);
     //删除简历
     void deleteResume(Resume resume);
     //修改简历
     void updateResume(Resume resume);
     //通过简历id查出具体简历
     Resume getResumeById(Resume resume);
}
