package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyUser;
import com.cunyun.zoneadmin.dto.CyUserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CyUserMapper {
    int insert(CyUser record);

    int insertSelective(CyUser record);

    CyUser selectByPrimaryKey(Integer id);


    int updateByPrimaryKeyWithBLOBs(CyUser record);

    int updateByPrimaryKey(CyUser record);

    int totalCount(CyUser cyUser);

    List<CyUserDto> list(@Param("begin") int offset, @Param("end")int limit, @Param("nickName")String nickName, @Param("userType") String userType, @Param("status")String status);

    int updateByPrimaryKeySelective(CyUser cyUser);
}