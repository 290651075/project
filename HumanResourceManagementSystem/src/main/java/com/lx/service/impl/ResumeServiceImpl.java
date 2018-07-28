package com.lx.service.impl;

import com.lx.dao.ResumeMapper;
import com.lx.model.Resume;
import com.lx.model.Tourist;
import com.lx.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/7/26.
 */
@Service
public class ResumeServiceImpl implements ResumeService {
    @Resource
    private ResumeMapper resumeMapper;

    @Override
    public List<Resume> getResume(Tourist tourist) {
        return resumeMapper.getResume(tourist);
    }

    @Override
    public void addResume(Resume resume) {
        resumeMapper.addResume(resume);
    }

    @Override
    public void deleteResume(Resume resume) {
        resumeMapper.deleteResume(resume);
    }

    @Override
    public void updateResume(Resume resume) {
        resumeMapper.updateResume(resume);
    }

    @Override
    public Resume getResumeById(Resume resume) {
        return resumeMapper.getResumeById(resume);
    }

    @Override
    public List<Resume> getResumeByTIdAndPage(int tId, int begin, int end) {
        return resumeMapper.getResumeByTIdAndPage(tId,begin,end);
    }
}
