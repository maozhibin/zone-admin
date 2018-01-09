package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyTwitter {
    private Integer id;

    private Integer idx;

    @Override
    public String toString() {
        return "CyTwitter{" +
                "id=" + id +
                ", idx=" + idx +
                ", twitterId='" + twitterId + '\'' +
                ", uid='" + uid + '\'' +
                ", title='" + title + '\'' +
                ", twitterType='" + twitterType + '\'' +
                ", readRule='" + readRule + '\'' +
                ", replyRule='" + replyRule + '\'' +
                ", hasAtts='" + hasAtts + '\'' +
                ", createdTime=" + createdTime +
                ", topicClass='" + topicClass + '\'' +
                ", voteCanAddOption=" + voteCanAddOption +
                ", voteMultipleChoice=" + voteMultipleChoice +
                ", pushStatus=" + pushStatus +
                ", icon='" + icon + '\'' +
                ", content='" + content + '\'' +
                ", showContent='" + showContent + '\'' +
                ", fromUrl='" + fromUrl + '\'' +
                '}';
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getIdx() {

        return idx;
    }

    private String twitterId;

    private String uid;

    private String title;

    private String twitterType;

    private String readRule;

    private String replyRule;

    private String hasAtts;

    private Date createdTime;

    private String topicClass;

    private Integer voteCanAddOption;

    private Integer voteMultipleChoice;

    private Integer pushStatus;

    private String icon;

    private String content;

    private String showContent;

    private String fromUrl;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTwitterType() {
        return twitterType;
    }

    public void setTwitterType(String twitterType) {
        this.twitterType = twitterType;
    }

    public String getReadRule() {
        return readRule;
    }

    public void setReadRule(String readRule) {
        this.readRule = readRule;
    }

    public String getReplyRule() {
        return replyRule;
    }

    public void setReplyRule(String replyRule) {
        this.replyRule = replyRule;
    }

    public String getHasAtts() {
        return hasAtts;
    }

    public void setHasAtts(String hasAtts) {
        this.hasAtts = hasAtts;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getTopicClass() {
        return topicClass;
    }

    public void setTopicClass(String topicClass) {
        this.topicClass = topicClass;
    }

    public Integer getVoteCanAddOption() {
        return voteCanAddOption;
    }

    public void setVoteCanAddOption(Integer voteCanAddOption) {
        this.voteCanAddOption = voteCanAddOption;
    }

    public Integer getVoteMultipleChoice() {
        return voteMultipleChoice;
    }

    public void setVoteMultipleChoice(Integer voteMultipleChoice) {
        this.voteMultipleChoice = voteMultipleChoice;
    }

    public Integer getPushStatus() {
        return pushStatus;
    }

    public void setPushStatus(Integer pushStatus) {
        this.pushStatus = pushStatus;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getShowContent() {
        return showContent;
    }

    public void setShowContent(String showContent) {
        this.showContent = showContent;
    }

    public String getFromUrl() {
        return fromUrl;
    }

    public void setFromUrl(String fromUrl) {
        this.fromUrl = fromUrl;
    }

}