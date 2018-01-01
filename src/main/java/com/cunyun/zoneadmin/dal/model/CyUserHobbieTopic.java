package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyUserHobbieTopic {
    private Integer id;

    private String uid;

    private String topicName;

    private String topicId;

    private Date createdTime;

    private String pushModel;

    private String pushTimes;

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

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getPushModel() {
        return pushModel;
    }

    public void setPushModel(String pushModel) {
        this.pushModel = pushModel;
    }

    public String getPushTimes() {
        return pushTimes;
    }

    public void setPushTimes(String pushTimes) {
        this.pushTimes = pushTimes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", topicName=").append(topicName);
        sb.append(", topicId=").append(topicId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", pushModel=").append(pushModel);
        sb.append(", pushTimes=").append(pushTimes);
        sb.append("]");
        return sb.toString();
    }
}