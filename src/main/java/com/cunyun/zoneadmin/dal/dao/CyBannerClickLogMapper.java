package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyBannerClickLog;

public interface CyBannerClickLogMapper {
    int insert(CyBannerClickLog record);

    int insertSelective(CyBannerClickLog record);

    CyBannerClickLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyBannerClickLog record);

    int updateByPrimaryKey(CyBannerClickLog record);
}