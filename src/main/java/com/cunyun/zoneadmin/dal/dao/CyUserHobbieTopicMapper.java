package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyUserHobbieTopic;

public interface CyUserHobbieTopicMapper {
    int insert(CyUserHobbieTopic record);

    int insertSelective(CyUserHobbieTopic record);

    CyUserHobbieTopic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyUserHobbieTopic record);

    int updateByPrimaryKey(CyUserHobbieTopic record);
}