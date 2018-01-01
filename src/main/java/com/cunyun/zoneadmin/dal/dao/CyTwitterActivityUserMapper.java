package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyTwitterActivityUser;

public interface CyTwitterActivityUserMapper {
    int insert(CyTwitterActivityUser record);

    int insertSelective(CyTwitterActivityUser record);

    CyTwitterActivityUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyTwitterActivityUser record);

    int updateByPrimaryKey(CyTwitterActivityUser record);
}