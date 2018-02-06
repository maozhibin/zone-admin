package com.cunyun.zoneadmin.dal.service;

import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyTwitter;
import com.cunyun.zoneadmin.dto.CyTwitterDto;

public interface CyTwitterService {
    void twitterList(Page<CyTwitterDto> page, CyTwitterDto cyTwitterDto);

    void byIdDelete(Integer id);

    void update(CyTwitterDto cyTwitterDto);
}
