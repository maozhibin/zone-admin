package com.cunyun.zoneadmin.dal.service;

import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyAdmin;

public interface CyAdminService {

    CyAdmin queryByName(String name);

    void update(CyAdmin cyAdmin);

    void insert(CyAdmin cyAdmin);

    void adminList(Page<CyAdmin> page, CyAdmin cyAdmin);
}
