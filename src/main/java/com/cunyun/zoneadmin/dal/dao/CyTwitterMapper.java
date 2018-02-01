package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyTwitter;
import com.cunyun.zoneadmin.dto.CyTwitterDto;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CyTwitterMapper {
    int insert(CyTwitter record);

    int insertSelective(CyTwitter record);

    CyTwitter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyTwitter record);

    int updateByPrimaryKeyWithBLOBs(CyTwitter record);

    int updateByPrimaryKey(CyTwitter record);

    int totalCount(CyTwitterDto cyTwitterDto);

    List<CyTwitterDto> queryByKeyWords(@Param("begin") int offset, @Param("end")int limit, @Param("createdTime")Date createdTime, @Param("uid")String uid, @Param("title")String title,@Param("twitterType")String twitterType);
}