package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyUser;
import com.cunyun.zoneadmin.dto.CyUserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CyUserMapper {
    int insert(CyUser record);

    int insertSelective(CyUser record);

    CyUser selectByPrimaryKey(Integer id);

    CyUser selectByNickName(@Param("nickName") String nickName);

    int updateByPrimaryKeyWithBLOBs(CyUser record);

    int updateByPrimaryKey(CyUser record);

    int totalCount(CyUserDto cyUser);

    List<CyUserDto> list(CyUserDto cyUserDto);

    int updateByPrimaryKeySelective(CyUser cyUser);

    CyUser queryById(Integer id);

    CyUser queryByUuid(@Param("uid") String uid);

    List<String> queryAllLableId();
}