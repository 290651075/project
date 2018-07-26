package com.lx.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/26.
 *
 *面试邀请及结果表
 *
 * 面试
 */
public class Interview implements Serializable{
    private int id;
    private Tourist tourist;//待邀请的游客
    private Recruitment recruitment;//与本次邀请对应的职位
    //邀请面试状态 1已邀请参加面试游客未确认是否参加（即收件箱信息） 2未邀请参加面试  3已邀请并且游客确认参加  4已邀请游客拒绝参加
    private int inviteState;
    private int resultState;//面试结果状态  1 面试通过可以录用  2 面试未通过

    public Interview() {
    }

    public Interview(Tourist tourist, Recruitment recruitment, int inviteState, int resultState) {
        this.tourist = tourist;
        this.recruitment = recruitment;
        this.inviteState = inviteState;
        this.resultState = resultState;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }

    public Recruitment getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(Recruitment recruitment) {
        this.recruitment = recruitment;
    }

    public int getInviteState() {
        return inviteState;
    }

    public void setInviteState(int inviteState) {
        this.inviteState = inviteState;
    }

    public int getResultState() {
        return resultState;
    }

    public void setResultState(int resultState) {
        this.resultState = resultState;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "id=" + id +
                ", tourist=" + tourist +
                ", recruitment=" + recruitment +
                ", inviteState=" + inviteState +
                ", resultState=" + resultState +
                '}';
    }
}
