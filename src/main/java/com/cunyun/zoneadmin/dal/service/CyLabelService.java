package com.cunyun.zoneadmin.dal.service;

import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyLabel;

import java.util.List;

public interface CyLabelService {
    void LableList(Page<CyLabel> page, CyLabel cyLabel);

    List<CyLabel> lableById(List<Integer> list1);

    void addCyLabel(CyLabel cyLabel);

    void editCyLabel(CyLabel cyLabel);

    List<CyLabel> lableCount(CyLabel cyLabel);
}
