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
        page.setRows(cyUserMapper.list(page.getOffset(),page.getLimit(),cyUser.getNickName(),cyUser.getUserType(),cyUser.getUserMobile(),cyUser.getStatus()));
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

    @Override
    public CyUserDto queryById(Integer id) {
        CyUser cyUser =  cyUserMapper.queryById(id);
        CyUserDto cyUserDto = new CyUserDto();
        cyUserDto.setId(cyUser.getId());
        cyUserDto.setNickName(cyUser.getNickName());
        cyUserDto.setCreatedTime(cyUser.getCreatedTime());
        cyUserDto.setUserMobile(cyUser.getUserMobile());

        //邀请人信息
        CyUser inviteCyUser = cyUserMapper.queryByUuid(cyUser.getInviteUid());
        if(inviteCyUser!=null){
            cyUserDto.setInviteUid(cyUser.getInviteUid());
            cyUserDto.setInviteNickName(inviteCyUser.getNickName());
        }
        cyUserDto.setUserSign(cyUser.getUserSign());
        cyUserDto.setWcUserName(cyUser.getWcUserName());
        cyUserDto.setStatus(cyUser.getStatus());
        cyUserDto.setName(cyUser.getName());
        cyUserDto.setCid(cyUser.getCid());
        cyUserDto.setCidUrl(cyUser.getCidUrl());
        cyUserDto.setLableId(cyUser.getLabelId());
       return cyUserDto;
    }

    @Override
    public void updateVerifyInfo(CyUserDto cyUserDto) {
        CyUser cyUser = new CyUser();
        cyUser.setId(cyUserDto.getId());
        cyUser.setStatus(cyUserDto.getStatus());
        cyUser.setLabelId(cyUserDto.getLableId());
        cyUserMapper.updateByPrimaryKeySelective(cyUser);
    }
}
