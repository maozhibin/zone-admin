package com.cunyun.zoneadmin.dal.service.impl;

import com.cunyun.zoneadmin.dal.dao.CyUserMapper;
import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyLabel;
import com.cunyun.zoneadmin.dal.model.CyUser;
import com.cunyun.zoneadmin.dal.service.CyLabelService;
import com.cunyun.zoneadmin.dal.service.CyUserService;
import com.cunyun.zoneadmin.dto.CyUserDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class CyUserServiceImpl implements CyUserService{
    @Resource
    private CyUserMapper cyUserMapper;
    @Resource
    private CyLabelService cyLabelService;
    @Override
    public void userList(Page<CyUserDto> page, CyUserDto cyUserDto) {

        cyUserDto.setBegin(page.getOffset());
        cyUserDto.setEnd(page.getLimit());
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        Date endTime = null;
        Date startTime = null;
        try {
            if(cyUserDto.getEndTimeStr()!=null && cyUserDto.getStartTimeStr()!=null){
                endTime = sdf.parse(cyUserDto.getEndTimeStr());
                startTime = sdf.parse(cyUserDto.getStartTimeStr());
                cyUserDto.setEndTime(endTime);
                cyUserDto.setStartTime(startTime);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<Integer> lableIdLists = cyUserDto.getLableIdList();
        String lableIdStr="";
        if(lableIdLists!=null){
            for (int i=0;i<lableIdLists.size();i++) {
                if(i==lableIdLists.size()-1){
                    lableIdStr += lableIdLists.get(i);
                }else{
                    lableIdStr += lableIdLists.get(i)+",";
                }
            }
            cyUserDto.setLableId(lableIdStr);
        }

        int total = cyUserMapper.totalCount(cyUserDto);
        page.setTotal(total);
        List<CyUserDto> lists = cyUserMapper.list(cyUserDto);
        for (CyUserDto list:lists) {
            List<Integer> lableIds = new ArrayList<>();
            String lableId = list.getLableId();
            String arrs[] = lableId.split(",");
            for (String arr:arrs) {
                lableIds.add(Integer.parseInt(arr));
            }
            List<CyLabel> CyLabels = cyLabelService.lableById(lableIds);
            String str="";
            for(int i=0;i<CyLabels.size();i++){
                if(i==CyLabels.size()-1){
                    str += CyLabels.get(i).getLabelName();
                }else{
                    str += CyLabels.get(i).getLabelName()+",";
                }
            }
            list.setLableName(str);
        }
        page.setRows(lists);
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

        List<Integer> lableIdList = cyUserDto.getLableIdList();
        String str="";
        for(int i=0;i<lableIdList.size();i++){
            if(i==lableIdList.size()-1){
                str += lableIdList.get(i);
            }else{
                str += lableIdList.get(i)+",";
            }
        }
        cyUser.setLabelId(str);
        cyUserMapper.updateByPrimaryKeySelective(cyUser);
    }
}
