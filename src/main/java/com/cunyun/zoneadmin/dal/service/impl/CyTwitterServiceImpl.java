package com.cunyun.zoneadmin.dal.service.impl;

import com.cunyun.zoneadmin.dal.dao.CyTwitterMapper;
import com.cunyun.zoneadmin.dal.dao.CyUserMapper;
import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyTwitter;
import com.cunyun.zoneadmin.dal.model.CyUser;
import com.cunyun.zoneadmin.dal.service.CyTwitterService;
import com.cunyun.zoneadmin.dto.CyTwitterDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CyTwitterServiceImpl implements CyTwitterService {

    @Resource
    private CyTwitterMapper cyTwitterMapper;
    @Resource
    private CyUserMapper cyUserMapper;


    @Override
    public void twitterList(Page<CyTwitterDto> page, CyTwitterDto cyTwitterDto) {
        String nickName = cyTwitterDto.getNickName();
        CyUser cyUser = cyUserMapper.selectByNickName(nickName);
        if(cyUser!=null){
            cyTwitterDto.setUid(cyUser.getUid());
        }
        int total = cyTwitterMapper.totalCount(cyTwitterDto);
        page.setTotal(total);
        page.setRows(cyTwitterMapper.queryByKeyWords(page.getOffset(),page.getLimit(),cyTwitterDto.getCreatedTime(),cyTwitterDto.getUid(),cyTwitterDto.getTitle(),cyTwitterDto.getTwitterType()));
    }
}


