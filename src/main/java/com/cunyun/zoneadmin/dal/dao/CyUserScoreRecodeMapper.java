package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyUserScoreRecode;

public interface CyUserScoreRecodeMapper {
    int insert(CyUserScoreRecode record);

    int insertSelective(CyUserScoreRecode record);

    CyUserScoreRecode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyUserScoreRecode record);

    int updateByPrimaryKey(CyUserScoreRecode record);
}