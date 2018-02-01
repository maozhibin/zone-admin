package com.cunyun.zoneadmin.dal.service.impl;

import com.cunyun.zoneadmin.dal.dao.CyAdminMapper;
import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyAdmin;
import com.cunyun.zoneadmin.dal.service.CyAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CyAdminServiceImpl implements CyAdminService {
    @Resource
    private CyAdminMapper cyAdminMapper;


    @Override
    public CyAdmin queryByName(String name) {
        return cyAdminMapper.queryByName(name);
    }

    @Override
    public void update(CyAdmin cyAdmin) {
        cyAdminMapper.update(cyAdmin);
    }

    @Override
    public void insert(CyAdmin cyAdmin) {
        cyAdminMapper.insert(cyAdmin);
    }

    @Override
    public void adminList(Page<CyAdmin> page, CyAdmin cyAdmin) {
        int total = cyAdminMapper.totalCount(cyAdmin);
        page.setTotal(total);
        page.setRows(cyAdminMapper.list(page.getOffset(),page.getLimit(),cyAdmin.getName(),cyAdmin.getStatus()));

    }
}
