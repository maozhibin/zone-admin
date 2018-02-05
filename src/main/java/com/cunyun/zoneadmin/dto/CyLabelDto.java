package com.cunyun.zoneadmin.dto;

import java.util.Date;

public class CyLabelDto {
    private Integer id;

    private String labelName;

    private Date createdTime;

    private Date updateTime;

    private Integer userNum;

    @Override
    public String toString() {
        return "CyLabelDto{" +
                "id=" + id +
                ", labelName='" + labelName + '\'' +
                ", createdTime=" + createdTime +
                ", updateTime=" + updateTime +
                ", userNum=" + userNum +
                '}';
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public Integer getUserNum() {

        return userNum;
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
