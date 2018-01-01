package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyTopic;

public interface CyTopicMapper {
    int insert(CyTopic record);

    int insertSelective(CyTopic record);

    CyTopic selectByPrimaryKey(String topicId);

    int updateByPrimaryKeySelective(CyTopic record);

    int updateByPrimaryKey(CyTopic record);
}