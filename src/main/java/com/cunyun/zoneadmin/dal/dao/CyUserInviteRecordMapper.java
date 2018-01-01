package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyUserInviteRecord;

public interface CyUserInviteRecordMapper {
    int insert(CyUserInviteRecord record);

    int insertSelective(CyUserInviteRecord record);

    CyUserInviteRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyUserInviteRecord record);

    int updateByPrimaryKey(CyUserInviteRecord record);
}