package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyTwitterFabulous;

public interface CyTwitterFabulousMapper {
    int insert(CyTwitterFabulous record);

    int insertSelective(CyTwitterFabulous record);

    CyTwitterFabulous selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyTwitterFabulous record);

    int updateByPrimaryKey(CyTwitterFabulous record);
}