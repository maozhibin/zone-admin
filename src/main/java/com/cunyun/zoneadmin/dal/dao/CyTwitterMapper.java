package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyTwitter;

public interface CyTwitterMapper {
    int insert(CyTwitter record);

    int insertSelective(CyTwitter record);

    CyTwitter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyTwitter record);

    int updateByPrimaryKeyWithBLOBs(CyTwitter record);

    int updateByPrimaryKey(CyTwitter record);
}