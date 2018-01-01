package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyUserInviteUrl;

public interface CyUserInviteUrlMapper {
    int insert(CyUserInviteUrl record);

    int insertSelective(CyUserInviteUrl record);

    CyUserInviteUrl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyUserInviteUrl record);

    int updateByPrimaryKey(CyUserInviteUrl record);
}