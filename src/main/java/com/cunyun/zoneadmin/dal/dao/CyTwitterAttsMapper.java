package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyTwitterAtts;

public interface CyTwitterAttsMapper {
    int insert(CyTwitterAtts record);

    int insertSelective(CyTwitterAtts record);

    CyTwitterAtts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyTwitterAtts record);

    int updateByPrimaryKey(CyTwitterAtts record);
}