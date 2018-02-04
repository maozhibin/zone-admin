package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyLabel {
    private Integer id;

    private String labelName;

    private Date createdTime;

    private Date updateTime;

    @Override
    public String toString() {
        return "CyLabel{" +
                "id=" + id +
                ", labelName='" + labelName + '\'' +
                ", createdTime=" + createdTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getId() {

        return id;
    }

    public String getLabelName() {
        return labelName;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
