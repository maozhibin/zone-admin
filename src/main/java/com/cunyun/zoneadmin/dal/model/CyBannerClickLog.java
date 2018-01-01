package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyBannerClickLog {
    private Integer id;

    private String bannerId;

    private String twitterId;

    private String uid;

    private Date createdTime;

    private String hasFee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getHasFee() {
        return hasFee;
    }

    public void setHasFee(String hasFee) {
        this.hasFee = hasFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bannerId=").append(bannerId);
        sb.append(", twitterId=").append(twitterId);
        sb.append(", uid=").append(uid);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", hasFee=").append(hasFee);
        sb.append("]");
        return sb.toString();
    }
}