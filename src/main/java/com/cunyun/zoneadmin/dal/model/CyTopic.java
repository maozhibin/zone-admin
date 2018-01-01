package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyTopic {
    private String topicId;

    private String topicName;

    private Date createdTime;

    private String uid;

    private String topicClass;

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
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

    public String getTopicClass() {
        return topicClass;
    }

    public void setTopicClass(String topicClass) {
        this.topicClass = topicClass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", topicId=").append(topicId);
        sb.append(", topicName=").append(topicName);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", uid=").append(uid);
        sb.append(", topicClass=").append(topicClass);
        sb.append("]");
        return sb.toString();
    }
}