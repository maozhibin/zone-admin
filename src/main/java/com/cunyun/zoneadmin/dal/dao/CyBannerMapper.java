package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyBanner;

public interface CyBannerMapper {
    int insert(CyBanner record);

    int insertSelective(CyBanner record);

    CyBanner selectByPrimaryKey(String bannerId);

    int updateByPrimaryKeySelective(CyBanner record);

    int updateByPrimaryKeyWithBLOBs(CyBanner record);

    int updateByPrimaryKey(CyBanner record);
}