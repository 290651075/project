package com.lx.service;

import com.lx.model.Resume;
import com.lx.model.Tourist;

import java.util.List;

/**
 * Created by Administrator on 2018/7/26.
 */
public interface ResumeService {
    List<Resume> getResume(Tourist tourist);
    void addResume(Resume resume);
    void deleteResume(Resume resume);
    void updateResume(Resume resume);
    Resume getResumeById(Resume resume);
    List<Resume> getResumeByTIdAndPage(int tId,int begin,int end);
}
