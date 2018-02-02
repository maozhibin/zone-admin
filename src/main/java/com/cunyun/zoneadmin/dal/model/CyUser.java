package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyUser {
    private Integer id;

    @Override
    public String toString() {
        return "CyUser{" +
                "id=" + id +
                ", black=" + black +
                ", labelId='" + labelId + '\'' +
                ", uid='" + uid + '\'' +
                ", nickName='" + nickName + '\'' +
                ", userAvatar='" + userAvatar + '\'' +
                ", userSign='" + userSign + '\'' +
                ", userMobile='" + userMobile + '\'' +
                ", userType='" + userType + '\'' +
                ", wcUserName='" + wcUserName + '\'' +
                ", wcNickName='" + wcNickName + '\'' +
                ", inviteUid='" + inviteUid + '\'' +
                ", wcQrCode='" + wcQrCode + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", createdTime=" + createdTime +
                ", status='" + status + '\'' +
                ", aliUserName='" + aliUserName + '\'' +
                ", aliNickName='" + aliNickName + '\'' +
                ", aliUserid='" + aliUserid + '\'' +
                ", vipLevel='" + vipLevel + '\'' +
                ", cyScoreCount=" + cyScoreCount +
                ", cyScoreBalance=" + cyScoreBalance +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", isRealName=" + isRealName +
                ", isRealMobile=" + isRealMobile +
                ", cid='" + cid + '\'' +
                ", cidUrl='" + cidUrl + '\'' +
                '}';
    }

    public void setBlack(Integer black) {
        this.black = black;
    }

    public Integer getBlack() {

        return black;
    }

    private Integer black;

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getLabelId() {

        return labelId;
    }

    private String labelId;

    private String uid;

    private String nickName;

    private String userAvatar;

    private String userSign;

    private String userMobile;

    private String userType;

    private String wcUserName;

    private String wcNickName;

    private String inviteUid;

    private String wcQrCode;

    private Date lastLoginTime;

    private Date createdTime;

    private String status;

    private String aliUserName;

    private String aliNickName;

    private String aliUserid;

    private String vipLevel;

    private Integer cyScoreCount;

    private Integer cyScoreBalance;

    private Integer balance;

    private String name;

    private Integer isRealName;

    private Integer isRealMobile;

    private String cid;
    private String cidUrl;

    public void setCidUrl(String cidUrl) {
        this.cidUrl = cidUrl;
    }

    public String getCidUrl() {

        return cidUrl;
    }

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getWcUserName() {
        return wcUserName;
    }

    public void setWcUserName(String wcUserName) {
        this.wcUserName = wcUserName;
    }

    public String getWcNickName() {
        return wcNickName;
    }

    public void setWcNickName(String wcNickName) {
        this.wcNickName = wcNickName;
    }

    public String getInviteUid() {
        return inviteUid;
    }

    public void setInviteUid(String inviteUid) {
        this.inviteUid = inviteUid;
    }

    public String getWcQrCode() {
        return wcQrCode;
    }

    public void setWcQrCode(String wcQrCode) {
        this.wcQrCode = wcQrCode;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAliUserName() {
        return aliUserName;
    }

    public void setAliUserName(String aliUserName) {
        this.aliUserName = aliUserName;
    }

    public String getAliNickName() {
        return aliNickName;
    }

    public void setAliNickName(String aliNickName) {
        this.aliNickName = aliNickName;
    }

    public String getAliUserid() {
        return aliUserid;
    }

    public void setAliUserid(String aliUserid) {
        this.aliUserid = aliUserid;
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Integer getCyScoreCount() {
        return cyScoreCount;
    }

    public void setCyScoreCount(Integer cyScoreCount) {
        this.cyScoreCount = cyScoreCount;
    }

    public Integer getCyScoreBalance() {
        return cyScoreBalance;
    }

    public void setCyScoreBalance(Integer cyScoreBalance) {
        this.cyScoreBalance = cyScoreBalance;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsRealName() {
        return isRealName;
    }

    public void setIsRealName(Integer isRealName) {
        this.isRealName = isRealName;
    }

    public Integer getIsRealMobile() {
        return isRealMobile;
    }

    public void setIsRealMobile(Integer isRealMobile) {
        this.isRealMobile = isRealMobile;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

}