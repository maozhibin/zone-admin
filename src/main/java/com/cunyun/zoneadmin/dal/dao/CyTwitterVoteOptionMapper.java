package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyTwitterVoteOption;

public interface CyTwitterVoteOptionMapper {
    int insert(CyTwitterVoteOption record);

    int insertSelective(CyTwitterVoteOption record);

    CyTwitterVoteOption selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyTwitterVoteOption record);

    int updateByPrimaryKey(CyTwitterVoteOption record);
}