package com.cunyun.zoneadmin.dal.service;

import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyLabel;
import com.cunyun.zoneadmin.dto.CyLabelDto;

import java.util.List;

public interface CyLabelService {
    void LableList(Page<CyLabelDto> page, CyLabel cyLabel);

    List<CyLabel> lableById(List<Integer> list1);

    void addCyLabel(CyLabel cyLabel);

    void editCyLabel(CyLabel cyLabel);

    List<CyLabel> lableCount(CyLabel cyLabel);

    Integer delete(int i);
}
