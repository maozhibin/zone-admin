package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyTopicClass {
    private Integer id;

    private String topicClass;

    private String topicClassName;

    private Date createdTime;

    private Integer level;

    private String upperTopicClass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopicClass() {
        return topicClass;
    }

    public void setTopicClass(String topicClass) {
        this.topicClass = topicClass;
    }

    public String getTopicClassName() {
        return topicClassName;
    }

    public void setTopicClassName(String topicClassName) {
        this.topicClassName = topicClassName;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUpperTopicClass() {
        return upperTopicClass;
    }

    public void setUpperTopicClass(String upperTopicClass) {
        this.upperTopicClass = upperTopicClass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", topicClass=").append(topicClass);
        sb.append(", topicClassName=").append(topicClassName);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", level=").append(level);
        sb.append(", upperTopicClass=").append(upperTopicClass);
        sb.append("]");
        return sb.toString();
    }
}