package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyTwitterVoteRecord;

public interface CyTwitterVoteRecordMapper {
    int insert(CyTwitterVoteRecord record);

    int insertSelective(CyTwitterVoteRecord record);

    CyTwitterVoteRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyTwitterVoteRecord record);

    int updateByPrimaryKeyWithBLOBs(CyTwitterVoteRecord record);

    int updateByPrimaryKey(CyTwitterVoteRecord record);
}