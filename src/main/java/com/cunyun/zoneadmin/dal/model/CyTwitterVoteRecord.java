package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyTwitterVoteRecord {
    private Integer id;

    private String twitterId;

    private Date createdTime;

    private String uid;

    private String voteRecord;

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

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getVoteRecord() {
        return voteRecord;
    }

    public void setVoteRecord(String voteRecord) {
        this.voteRecord = voteRecord;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", twitterId=").append(twitterId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", uid=").append(uid);
        sb.append(", voteRecord=").append(voteRecord);
        sb.append("]");
        return sb.toString();
    }
}