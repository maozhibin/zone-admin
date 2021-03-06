package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyTwitterAtts {
    private Integer id;

    private String twitterId;

    private String attsName;

    private String attsType;

    private String attsUrl;

    private Date createdTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getAttsName() {
        return attsName;
    }

    public void setAttsName(String attsName) {
        this.attsName = attsName;
    }

    public String getAttsType() {
        return attsType;
    }

    public void setAttsType(String attsType) {
        this.attsType = attsType;
    }

    public String getAttsUrl() {
        return attsUrl;
    }

    public void setAttsUrl(String attsUrl) {
        this.attsUrl = attsUrl;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", twitterId=").append(twitterId);
        sb.append(", attsName=").append(attsName);
        sb.append(", attsType=").append(attsType);
        sb.append(", attsUrl=").append(attsUrl);
        sb.append(", createdTime=").append(createdTime);
        sb.append("]");
        return sb.toString();
    }
}