package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyTwitterCollection;

public interface CyTwitterCollectionMapper {
    int insert(CyTwitterCollection record);

    int insertSelective(CyTwitterCollection record);

    CyTwitterCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyTwitterCollection record);

    int updateByPrimaryKey(CyTwitterCollection record);
}