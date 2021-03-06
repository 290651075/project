package com.lx.model;



import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/7/26.
 *
 * 简历表
 *
 * 简历
 */
public class Resume implements Serializable{
    private int id;
    private String name;//真实姓名
    private String sex;//性别
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birth;//出生年月
    private String school;//毕业院校
    private String rname;//简历名称
    private String nation;//民族
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date graduationTime;//毕业时间
    private String workEXP;//工作经验
    private String birthPlace;//出生地
    private String evaluate;//自我评价
    private String idCard;//身份证号
    private int phone;//电话号码
    private String email;//邮箱
    private Tourist tourist;//对应该简历的游客
    public Resume() {
    }

    public Resume(int id) {
        this.id = id;
    }

    public Resume(String name, String sex, Date birth, String school, String rname, String nation, Date graduationTime, String workEXP, String birthPlace, String evaluate, String idCard, int phone, String email) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.school = school;
        this.rname = rname;
        this.nation = nation;
        this.graduationTime = graduationTime;
        this.workEXP = workEXP;
        this.birthPlace = birthPlace;
        this.evaluate = evaluate;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }


    public String getWorkEXP() {
        return workEXP;
    }

    public void setWorkEXP(String workEXP) {
        this.workEXP = workEXP;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                ", school='" + school + '\'' +
                ", nation='" + nation + '\'' +
                ", graduationTime=" + graduationTime +
                ", workEXP='" + workEXP + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", evaluate='" + evaluate + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", rname='" + rname + '\'' +
                ", tourist=" + tourist +
                '}';
    }
}
