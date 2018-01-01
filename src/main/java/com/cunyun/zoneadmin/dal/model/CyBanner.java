package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyBanner {
    private String bannerId;

    private Date createdTime;

    private Date startTime;

    private Date endTime;

    private String deliveryVipLevel;

    private String content;

    private String clickUrl;

    private String deliveryTopicClass;

    private String deliveryTopic;

    private String deliveryRuleExt;

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDeliveryVipLevel() {
        return deliveryVipLevel;
    }

    public void setDeliveryVipLevel(String deliveryVipLevel) {
        this.deliveryVipLevel = deliveryVipLevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getClickUrl() {
        return clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
    }

    public String getDeliveryTopicClass() {
        return deliveryTopicClass;
    }

    public void setDeliveryTopicClass(String deliveryTopicClass) {
        this.deliveryTopicClass = deliveryTopicClass;
    }

    public String getDeliveryTopic() {
        return deliveryTopic;
    }

    public void setDeliveryTopic(String deliveryTopic) {
        this.deliveryTopic = deliveryTopic;
    }

    public String getDeliveryRuleExt() {
        return deliveryRuleExt;
    }

    public void setDeliveryRuleExt(String deliveryRuleExt) {
        this.deliveryRuleExt = deliveryRuleExt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bannerId=").append(bannerId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", deliveryVipLevel=").append(deliveryVipLevel);
        sb.append(", content=").append(content);
        sb.append(", clickUrl=").append(clickUrl);
        sb.append(", deliveryTopicClass=").append(deliveryTopicClass);
        sb.append(", deliveryTopic=").append(deliveryTopic);
        sb.append(", deliveryRuleExt=").append(deliveryRuleExt);
        sb.append("]");
        return sb.toString();
    }
}