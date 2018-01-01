package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyTopicClass;

public interface CyTopicClassMapper {
    int insert(CyTopicClass record);

    int insertSelective(CyTopicClass record);

    CyTopicClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyTopicClass record);

    int updateByPrimaryKey(CyTopicClass record);
}