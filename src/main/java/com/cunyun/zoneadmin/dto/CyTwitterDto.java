package com.cunyun.zoneadmin.dto;

import lombok.Data;

import java.util.Date;
public class CyTwitterDto {
    private Integer id;

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

    private String twitterId;

    private String nickName;

    private String uid;

    private String title;

    private String twitterType;

    private String readRule;

    private String replyRule;

    private String hasAtts;

    private Date createdTime;

    private String endTime;

    private String statrTime;

    private Date endTimeDate;

    @Override
    public String toString() {
        return "CyTwitterDto{" +
                "id=" + id +
                ", begin=" + begin +
                ", end=" + end +
                ", twitterId='" + twitterId + '\'' +
                ", nickName='" + nickName + '\'' +
                ", uid='" + uid + '\'' +
                ", title='" + title + '\'' +
                ", twitterType='" + twitterType + '\'' +
                ", readRule='" + readRule + '\'' +
                ", replyRule='" + replyRule + '\'' +
                ", hasAtts='" + hasAtts + '\'' +
                ", createdTime=" + createdTime +
                ", endTime='" + endTime + '\'' +
                ", statrTime='" + statrTime + '\'' +
                ", endTimeDate=" + endTimeDate +
                ", statrTimeDate=" + statrTimeDate +
                ", topicClass='" + topicClass + '\'' +
                ", voteCanAddOption=" + voteCanAddOption +
                ", voteMultipleChoice=" + voteMultipleChoice +
                ", pushStatus=" + pushStatus +
                ", icon='" + icon + '\'' +
                ", idx=" + idx +
                ", content='" + content + '\'' +
                ", showContent='" + showContent + '\'' +
                ", fromUrl='" + fromUrl + '\'' +
                '}';
    }

    public void setEndTimeDate(Date endTimeDate) {
        this.endTimeDate = endTimeDate;
    }

    public void setStatrTimeDate(Date statrTimeDate) {
        this.statrTimeDate = statrTimeDate;
    }

    public Date getEndTimeDate() {

        return endTimeDate;
    }

    public Date getStatrTimeDate() {
        return statrTimeDate;
    }


    private Date statrTimeDate;
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setStatrTime(String statrTime) {
        this.statrTime = statrTime;
    }

    public String getStatrTime() {

        return statrTime;
    }

    public String getEndTime() {

        return endTime;
    }

    private String topicClass;

    private Integer voteCanAddOption;

    private Integer voteMultipleChoice;

    private Integer pushStatus;

    private String icon;

    private Integer idx;

    private String content;

    private String showContent;

    private String fromUrl;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTwitterType(String twitterType) {
        this.twitterType = twitterType;
    }

    public void setReadRule(String readRule) {
        this.readRule = readRule;
    }

    public void setReplyRule(String replyRule) {
        this.replyRule = replyRule;
    }

    public void setHasAtts(String hasAtts) {
        this.hasAtts = hasAtts;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public void setTopicClass(String topicClass) {
        this.topicClass = topicClass;
    }

    public void setVoteCanAddOption(Integer voteCanAddOption) {
        this.voteCanAddOption = voteCanAddOption;
    }

    public void setVoteMultipleChoice(Integer voteMultipleChoice) {
        this.voteMultipleChoice = voteMultipleChoice;
    }

    public void setPushStatus(Integer pushStatus) {
        this.pushStatus = pushStatus;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setShowContent(String showContent) {
        this.showContent = showContent;
    }

    public void setFromUrl(String fromUrl) {
        this.fromUrl = fromUrl;
    }

    public Integer getId() {

        return id;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public String getNickName() {
        return nickName;
    }

    public String getUid() {
        return uid;
    }

    public String getTitle() {
        return title;
    }

    public String getTwitterType() {
        return twitterType;
    }

    public String getReadRule() {
        return readRule;
    }

    public String getReplyRule() {
        return replyRule;
    }

    public String getHasAtts() {
        return hasAtts;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public String getTopicClass() {
        return topicClass;
    }

    public Integer getVoteCanAddOption() {
        return voteCanAddOption;
    }

    public Integer getVoteMultipleChoice() {
        return voteMultipleChoice;
    }

    public Integer getPushStatus() {
        return pushStatus;
    }

    public String getIcon() {
        return icon;
    }

    public Integer getIdx() {
        return idx;
    }

    public String getContent() {
        return content;
    }

    public String getShowContent() {
        return showContent;
    }

    public String getFromUrl() {
        return fromUrl;
    }
}
