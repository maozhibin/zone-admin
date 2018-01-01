package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyTwitterReply {
    private Integer id;

    private String twitterId;

    private String uid;

    private String pid;

    private Integer viewpointInt;

    private String userAvatar;

    private Date createdTime;

    private Integer status;

    private String content;

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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Integer getViewpointInt() {
        return viewpointInt;
    }

    public void setViewpointInt(Integer viewpointInt) {
        this.viewpointInt = viewpointInt;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", twitterId=").append(twitterId);
        sb.append(", uid=").append(uid);
        sb.append(", pid=").append(pid);
        sb.append(", viewpointInt=").append(viewpointInt);
        sb.append(", userAvatar=").append(userAvatar);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", status=").append(status);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}