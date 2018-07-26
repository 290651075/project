package com.lx.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/26.
 * 中间表
 * 用于存储投递成功的简历和对应的职位，便于管理员在筛选简历时获得应聘者的简历和投递的职位
 *
 */
public class ResAndRec implements Serializable{
    private int id;
    private Resume resume;//成功投递的简历
    private Recruitment recruitment;//投递的职位

    public ResAndRec() {
    }

    public ResAndRec(Resume resume, Recruitment recruitment) {
        this.resume = resume;
        this.recruitment = recruitment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public Recruitment getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(Recruitment recruitment) {
        this.recruitment = recruitment;
    }

    @Override
    public String toString() {
        return "ResAndRec{" +
                "id=" + id +
                ", resume=" + resume +
                ", recruitment=" + recruitment +
                '}';
    }
}
