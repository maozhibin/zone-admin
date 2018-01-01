package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyUserFriends;

public interface CyUserFriendsMapper {
    int insert(CyUserFriends record);

    int insertSelective(CyUserFriends record);

    CyUserFriends selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyUserFriends record);

    int updateByPrimaryKey(CyUserFriends record);
}