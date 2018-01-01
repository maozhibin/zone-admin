package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyUserInviteUrl {
    private Integer id;

    private String uid;

    private String inviteModel;

    private Date createdTime;

    private String inviteUrl;

    private String inviteCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getInviteModel() {
        return inviteModel;
    }

    public void setInviteModel(String inviteModel) {
        this.inviteModel = inviteModel;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getInviteUrl() {
        return inviteUrl;
    }

    public void setInviteUrl(String inviteUrl) {
        this.inviteUrl = inviteUrl;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", inviteModel=").append(inviteModel);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", inviteUrl=").append(inviteUrl);
        sb.append(", inviteCode=").append(inviteCode);
        sb.append("]");
        return sb.toString();
    }
}