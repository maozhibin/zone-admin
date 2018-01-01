package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyTwitterAtts {
    private Integer id;

    private String twitterId;

    private String attsType;

    private Date createdTime;

    private String attsUrl;

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

    public String getAttsType() {
        return attsType;
    }

    public void setAttsType(String attsType) {
        this.attsType = attsType;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getAttsUrl() {
        return attsUrl;
    }

    public void setAttsUrl(String attsUrl) {
        this.attsUrl = attsUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", twitterId=").append(twitterId);
        sb.append(", attsType=").append(attsType);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", attsUrl=").append(attsUrl);
        sb.append("]");
        return sb.toString();
    }
}