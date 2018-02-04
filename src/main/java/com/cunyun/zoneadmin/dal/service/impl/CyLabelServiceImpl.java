package com.cunyun.zoneadmin.dal.service.impl;

import com.cunyun.zoneadmin.dal.dao.CyLabelMapper;
import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyLabel;
import com.cunyun.zoneadmin.dal.service.CyLabelService;
import com.cunyun.zoneadmin.dto.CyUserDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CyLabelServiceImpl implements CyLabelService {

    @Resource
    private CyLabelMapper cyLabelMapper;

    @Override
    public void LableList(Page<CyLabel> page, CyLabel cyLabel) {
        int total = cyLabelMapper.totalCount(cyLabel);
        page.setTotal(total);
        page.setRows(cyLabelMapper.list(page.getOffset(),page.getLimit(),cyLabel.getLabelName()));

    }

    @Override
    public List<CyLabel> lableById(List<Integer> list1) {
        return cyLabelMapper.lableById(list1);
    }

    @Override
    public void addCyLabel(CyLabel cyLabel) {
        cyLabelMapper.insert(cyLabel);
    }

    @Override
    public void editCyLabel(CyLabel cyLabel) {
        cyLabelMapper.updateByPrimaryKeySelective(cyLabel);
    }

    @Override
    public List<CyLabel> lableCount(CyLabel cyLabel) {
        return cyLabelMapper.lableCount(cyLabel);
    }


}
