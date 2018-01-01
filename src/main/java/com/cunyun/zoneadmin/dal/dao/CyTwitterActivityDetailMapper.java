package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyTwitterActivityDetail;

public interface CyTwitterActivityDetailMapper {
    int insert(CyTwitterActivityDetail record);

    int insertSelective(CyTwitterActivityDetail record);

    CyTwitterActivityDetail selectByPrimaryKey(String twitterId);

    int updateByPrimaryKeySelective(CyTwitterActivityDetail record);

    int updateByPrimaryKey(CyTwitterActivityDetail record);
}