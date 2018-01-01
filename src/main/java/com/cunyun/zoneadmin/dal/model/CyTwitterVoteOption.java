package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyTwitterVoteOption {
    private Integer id;

    private String twitterId;

    private Integer sort;

    private String voteText;

    private Integer votePercent;

    private String uid;

    private String status;

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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getVoteText() {
        return voteText;
    }

    public void setVoteText(String voteText) {
        this.voteText = voteText;
    }

    public Integer getVotePercent() {
        return votePercent;
    }

    public void setVotePercent(Integer votePercent) {
        this.votePercent = votePercent;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        sb.append(", sort=").append(sort);
        sb.append(", voteText=").append(voteText);
        sb.append(", votePercent=").append(votePercent);
        sb.append(", uid=").append(uid);
        sb.append(", status=").append(status);
        sb.append(", createdTime=").append(createdTime);
        sb.append("]");
        return sb.toString();
    }
}