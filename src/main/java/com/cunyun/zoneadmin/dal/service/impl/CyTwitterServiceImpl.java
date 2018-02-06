package com.cunyun.zoneadmin.dal.service.impl;

import com.cunyun.zoneadmin.dal.dao.CyTwitterActivityDetailMapper;
import com.cunyun.zoneadmin.dal.dao.CyTwitterMapper;
import com.cunyun.zoneadmin.dal.dao.CyUserMapper;
import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyTwitter;
import com.cunyun.zoneadmin.dal.model.CyTwitterActivityDetail;
import com.cunyun.zoneadmin.dal.model.CyUser;
import com.cunyun.zoneadmin.dal.service.CyTwitterService;
import com.cunyun.zoneadmin.dto.CyTwitterDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CyTwitterServiceImpl implements CyTwitterService {

    @Resource
    private CyTwitterMapper cyTwitterMapper;
    @Resource
    private CyUserMapper cyUserMapper;
    @Resource
    private CyTwitterActivityDetailMapper cyTwitterActivityDetailMapper;
    @Override
    public void twitterList(Page<CyTwitterDto> page, CyTwitterDto cyTwitterDto) {
        String nickName = cyTwitterDto.getNickName();
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        Date endTime = null;
        Date startTime = null;
        try {
            if(cyTwitterDto.getEndTime()!=null && cyTwitterDto.getStatrTime()!=null){
                 endTime = sdf.parse( cyTwitterDto.getEndTime());
                 startTime = sdf.parse( cyTwitterDto.getStatrTime());
                 cyTwitterDto.setEndTimeDate(endTime);
                 cyTwitterDto.setStatrTimeDate(startTime);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        CyUser cyUser = cyUserMapper.selectByNickName(nickName);
        if(cyUser!=null){
            cyTwitterDto.setUid(cyUser.getUid());
        }
        int total = cyTwitterMapper.totalCount(cyTwitterDto);
        page.setTotal(total);
        cyTwitterDto.setBegin(page.getOffset());
        cyTwitterDto.setEnd(page.getLimit());
        List<CyTwitterDto> lists = cyTwitterMapper.queryByKeyWords(cyTwitterDto);
        for (CyTwitterDto list:lists) {
            CyUser cyUser1 =cyUserMapper.queryByUuid(list.getUid());
            if(cyUser1!=null){
                list.setNickName(cyUser1.getNickName());
            }
            if("activity".equals(list.getTwitterType())){
                CyTwitterActivityDetail cyTwitterActivityDetail = cyTwitterActivityDetailMapper.selectByPrimaryKey(list.getTwitterId());
                if(cyTwitterActivityDetail!=null){
                    list.setSponsor(cyTwitterActivityDetail.getSponsor());
                    list.setActivityArea(cyTwitterActivityDetail.getActivityArea());
                    list.setActivityTime(cyTwitterActivityDetail.getActivityTime());
                }
            }
        }
        page.setRows(lists);
    }

    @Override
    public void byIdDelete(Integer id) {
        cyTwitterMapper.byIdDelete(id);
    }

    @Override
    public void update(CyTwitterDto cyTwitterDto) {
        CyTwitter cyTwitter = new CyTwitter();
        cyTwitter.setId(cyTwitterDto.getId());
        cyTwitter.setPushStatus(cyTwitterDto.getPushStatus());
        cyTwitterMapper.updateByPrimaryKeySelective(cyTwitter);
    }
}


