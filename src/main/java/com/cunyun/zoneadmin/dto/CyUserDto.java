package com.cunyun.zoneadmin.dto;

import lombok.Data;
import java.util.Date;
import java.util.List;

public class CyUserDto {
    private Integer id;

    private String uid;

    private String lableName;

    private Integer begin;

    private Integer end;

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Integer getBegin() {

        return begin;
    }

    public Integer getEnd() {
        return end;
    }

    private List<Integer> lableIdList;

    public void setLableIdList(List<Integer> lableIdList) {
        this.lableIdList = lableIdList;
    }

    public List<Integer> getLableIdList() {

        return lableIdList;
    }

    private String lableId;

    private String uidNickName;

    public void setLableId(String lableId) {
        this.lableId = lableId;
    }

    public String getLableId() {
        return lableId;
    }

    private String nickName;

    private String userAvatar;

    private String userSign;

    private String userMobile;

    private String userType;

    private String userTypeValue;

    private String wcUserName;

    private String wcNickName;

    private String inviteUid;

    public void setInviteNickName(String inviteNickName) {
        this.inviteNickName = inviteNickName;
    }

    public String getInviteNickName() {

        return inviteNickName;
    }

    private String inviteNickName;

    private String wcQrCode;

    private Date lastLoginTime;

    private Date createdTime;

    private Date updateTime;


    private String endTimeStr;

    @Override
    public String toString() {
        return "CyUserDto{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", lableName='" + lableName + '\'' +
                ", begin=" + begin +
                ", end=" + end +
                ", lableIdList=" + lableIdList +
                ", lableId='" + lableId + '\'' +
                ", uidNickName='" + uidNickName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", userAvatar='" + userAvatar + '\'' +
                ", userSign='" + userSign + '\'' +
                ", userMobile='" + userMobile + '\'' +
                ", userType='" + userType + '\'' +
                ", userTypeValue='" + userTypeValue + '\'' +
                ", wcUserName='" + wcUserName + '\'' +
                ", wcNickName='" + wcNickName + '\'' +
                ", inviteUid='" + inviteUid + '\'' +
                ", inviteNickName='" + inviteNickName + '\'' +
                ", wcQrCode='" + wcQrCode + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", createdTime=" + createdTime +
                ", updateTime=" + updateTime +
                ", endTimeStr='" + endTimeStr + '\'' +
                ", startTimeStr='" + startTimeStr + '\'' +
                ", endTime=" + endTime +
                ", startTime=" + startTime +
                ", status='" + status + '\'' +
                ", statusValue='" + statusValue + '\'' +
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

    public void setEndTimeStr(String endTimeStr) {
        this.endTimeStr = endTimeStr;
    }

    public void setStartTimeStr(String startTimeStr) {
        this.startTimeStr = startTimeStr;
    }

    public String getEndTimeStr() {

        return endTimeStr;
    }

    public String getStartTimeStr() {
        return startTimeStr;
    }

    private String startTimeStr;

    private Date endTime;

    private Date startTime;

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {

        return endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    private String status;

    private String statusValue;

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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setLableName(String lableName) {
        this.lableName = lableName;
    }

    public void setUidNickName(String uidNickName) {
        this.uidNickName = uidNickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setUserTypeValue(String userTypeValue) {
        this.userTypeValue = userTypeValue;
    }

    public void setWcUserName(String wcUserName) {
        this.wcUserName = wcUserName;
    }

    public void setWcNickName(String wcNickName) {
        this.wcNickName = wcNickName;
    }

    public void setInviteUid(String inviteUid) {
        this.inviteUid = inviteUid;
    }

    public void setWcQrCode(String wcQrCode) {
        this.wcQrCode = wcQrCode;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue;
    }

    public void setAliUserName(String aliUserName) {
        this.aliUserName = aliUserName;
    }

    public void setAliNickName(String aliNickName) {
        this.aliNickName = aliNickName;
    }

    public void setAliUserid(String aliUserid) {
        this.aliUserid = aliUserid;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    public void setCyScoreCount(Integer cyScoreCount) {
        this.cyScoreCount = cyScoreCount;
    }

    public void setCyScoreBalance(Integer cyScoreBalance) {
        this.cyScoreBalance = cyScoreBalance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsRealName(Integer isRealName) {
        this.isRealName = isRealName;
    }

    public void setIsRealMobile(Integer isRealMobile) {
        this.isRealMobile = isRealMobile;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setCidUrl(String cidUrl) {
        this.cidUrl = cidUrl;
    }

    public Integer getId() {

        return id;
    }

    public String getUid() {
        return uid;
    }

    public String getLableName() {
        return lableName;
    }

    public String getUidNickName() {
        return uidNickName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public String getUserSign() {
        return userSign;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public String getUserType() {
        return userType;
    }

    public String getUserTypeValue() {
        return userTypeValue;
    }

    public String getWcUserName() {
        return wcUserName;
    }

    public String getWcNickName() {
        return wcNickName;
    }

    public String getInviteUid() {
        return inviteUid;
    }

    public String getWcQrCode() {
        return wcQrCode;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public String getStatus() {
        return status;
    }

    public String getStatusValue() {
        return statusValue;
    }

    public String getAliUserName() {
        return aliUserName;
    }

    public String getAliNickName() {
        return aliNickName;
    }

    public String getAliUserid() {
        return aliUserid;
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public Integer getCyScoreCount() {
        return cyScoreCount;
    }

    public Integer getCyScoreBalance() {
        return cyScoreBalance;
    }

    public Integer getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public Integer getIsRealName() {
        return isRealName;
    }

    public Integer getIsRealMobile() {
        return isRealMobile;
    }

    public String getCid() {
        return cid;
    }

    public String getCidUrl() {
        return cidUrl;
    }
}
