package com.cunyun.zoneadmin.dal.dao;

import com.cunyun.zoneadmin.dal.model.CyAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CyAdminMapper {

    CyAdmin queryByName(@Param("name") String name);

    void update(CyAdmin cyAdmin);

    void insert(CyAdmin cyAdmin);

    int totalCount(CyAdmin cyAdmin);

    List<CyAdmin> list(@Param("begin") int offset, @Param("end")int limit, @Param("name")String name, @Param("status")Integer status);
}
