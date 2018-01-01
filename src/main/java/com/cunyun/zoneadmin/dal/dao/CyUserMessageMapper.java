package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyUserMessage;

public interface CyUserMessageMapper {
    int insert(CyUserMessage record);

    int insertSelective(CyUserMessage record);

    CyUserMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyUserMessage record);

    int updateByPrimaryKey(CyUserMessage record);
}