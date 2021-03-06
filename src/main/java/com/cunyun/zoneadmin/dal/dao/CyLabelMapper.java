package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyLabel;
import com.cunyun.zoneadmin.dto.CyLabelDto;
import com.cunyun.zoneadmin.dto.CyUserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CyLabelMapper {
    int insert(CyLabel record);

    int insertSelective(CyLabel record);

    CyLabel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CyLabel record);

    int updateByPrimaryKey(CyLabel record);

    int totalCount(CyLabel cyLabel);

    List<CyLabelDto> list(@Param("begin") int offset, @Param("end")int limit);

    List<CyLabel> lableById(List<Integer> list);

    List<CyLabel> lableCount(CyLabel cyLabel);

    Integer delete(int id);
}