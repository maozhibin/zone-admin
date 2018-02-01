package com.cunyun.zoneadmin.dal.model;

import lombok.Data;

import java.util.Date;


public class CyAdmin {
    private Integer id;

    private Date createdTime;

    private Date updateTime;

    private String password;

    private String name;

    private Integer status;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CyAdmin{" +
                "id=" + id +
                ", createdTime=" + createdTime +
                ", updateTime=" + updateTime +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Integer getStatus() {
        return status;
    }
}
