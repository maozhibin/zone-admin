package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyTwitterReply;

public interface CyTwitterReplyMapper {
    int insert(CyTwitterReply record);

    int insertSelective(CyTwitterReply record);

    CyTwitterReply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyTwitterReply record);

    int updateByPrimaryKeyWithBLOBs(CyTwitterReply record);

    int updateByPrimaryKey(CyTwitterReply record);
}