package com.cunyun.zoneadmin.dal.service.impl;

import com.cunyun.zoneadmin.dal.dao.CyUserMapper;
import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyUser;
import com.cunyun.zoneadmin.dal.service.CyUserService;
import com.cunyun.zoneadmin.dto.CyUserDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CyUserServiceImpl implements CyUserService{
    @Resource
    private CyUserMapper cyUserMapper;

    @Override
    public void userList(Page<CyUserDto> page, CyUser cyUser) {
        int total = cyUserMapper.totalCount(cyUser);
        page.setTotal(total);
        page.setRows(cyUserMapper.list(page.getOffset(),page.getLimit(),cyUser.getNickName(),cyUser.getUserType(),cyUser.getUserMobile()));
    }

    @Override
    public void updateSattus(CyUser cyUser) {
        cyUserMapper.updateByPrimaryKeySelective(cyUser);
    }

    @Override
    public void addUser(CyUser cyUser) {
        cyUserMapper.insert(cyUser);
    }

    @Override
    public void editUser(CyUser cyUser) {
        cyUserMapper.updateByPrimaryKeyWithBLOBs(cyUser);
    }

    @Override
    public void updateUserType(CyUser cyUser) {
        cyUserMapper.updateByPrimaryKeySelective(cyUser);
    }
}
