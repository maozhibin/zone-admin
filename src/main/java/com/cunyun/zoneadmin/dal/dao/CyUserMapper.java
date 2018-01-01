package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyUser;

public interface CyUserMapper {
    int insert(CyUser record);

    int insertSelective(CyUser record);

    CyUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyUser record);

    int updateByPrimaryKeyWithBLOBs(CyUser record);

    int updateByPrimaryKey(CyUser record);
}