package com.cunyun.zoneadmin.dal.service.impl;

import com.cunyun.zoneadmin.dal.dao.CyLabelMapper;
import com.cunyun.zoneadmin.dal.dao.CyUserMapper;
import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyLabel;
import com.cunyun.zoneadmin.dal.service.CyLabelService;
import com.cunyun.zoneadmin.dto.CyLabelDto;
import com.cunyun.zoneadmin.dto.CyUserDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CyLabelServiceImpl implements CyLabelService {

    @Resource
    private CyLabelMapper cyLabelMapper;

    @Resource
    private CyUserMapper cyUserMapper;

    @Override
    public void LableList(Page<CyLabelDto> page, CyLabel cyLabel) {
        int total = cyLabelMapper.totalCount(cyLabel);
        page.setTotal(total);
        List<CyLabelDto> lists = cyLabelMapper.list(page.getOffset(),page.getLimit());
        List<String> lableIds = cyUserMapper.queryAllLableId();
        //查询关联用户标签的数量
        for (CyLabelDto list:lists) {
            int num=0;
            for (String lableId:lableIds) {
                String arr []  = lableId.split(",");
                for (int i=0;i<arr.length;i++){
                    if(Integer.parseInt(arr[i])==(list.getId())){
                        num++;
                    }
                }
            }
            list.setUserNum(num);
        }

        page.setRows(lists);

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

    @Override
    public Integer delete(int id) {
        return cyLabelMapper.delete(id);
    }


}
