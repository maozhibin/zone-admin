package com.cunyun.zoneadmin.dal.model;

import java.util.Date;

public class CyUserScoreRecode {
    private Integer id;

    private String uid;

    private String twitterId;

    private String scoreType;

    private Date createdTime;

    private Integer score;

    private Integer countScore;

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

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getScoreType() {
        return scoreType;
    }

    public void setScoreType(String scoreType) {
        this.scoreType = scoreType;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getCountScore() {
        return countScore;
    }

    public void setCountScore(Integer countScore) {
        this.countScore = countScore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", twitterId=").append(twitterId);
        sb.append(", scoreType=").append(scoreType);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", score=").append(score);
        sb.append(", countScore=").append(countScore);
        sb.append("]");
        return sb.toString();
    }
}