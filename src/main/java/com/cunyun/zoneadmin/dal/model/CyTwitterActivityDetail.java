package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyTwitterActivityDetail {
    private String twitterId;

    private String activityArea;

    private String sponsor;

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getSponsor() {

        return sponsor;
    }

    private String activityTime;

    private String xCoordinates;


    private Date createdTime;

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getActivityArea() {
        return activityArea;
    }

    public void setActivityArea(String activityArea) {
        this.activityArea = activityArea;
    }




    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime;
    }

    public String getActivityTime() {

        return activityTime;
    }

    public String getxCoordinates() {
        return xCoordinates;
    }

    public void setxCoordinates(String xCoordinates) {
        this.xCoordinates = xCoordinates;
    }


    @Override
    public String toString() {
        return "CyTwitterActivityDetail{" +
                "twitterId='" + twitterId + '\'' +
                ", activityArea='" + activityArea + '\'' +
                ", sponsor='" + sponsor + '\'' +
                ", activityTime='" + activityTime + '\'' +
                ", xCoordinates='" + xCoordinates + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

}