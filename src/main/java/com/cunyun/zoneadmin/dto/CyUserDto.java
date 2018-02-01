package com.cunyun.zoneadmin.dto;

import lombok.Data;
import java.util.Date;
@Data
public class CyUserDto {
    private Integer id;

    private String uid;

    private String uidNickName;

    private String nickName;

    private String userAvatar;

    private String userSign;

    private String userMobile;

    private String userType;

    private String userTypeValue;

    private String wcUserName;

    private String wcNickName;

    private String inviteUid;

    private String wcQrCode;

    private Date lastLoginTime;

    private Date createdTime;

    private Date updateTime;

    private String status;

    private String statusValue;

    private String aliUserName;

    private String aliNickName;

    private String aliUserid;

    private String vipLevel;

    private Integer cyScoreCount;

    private Integer cyScoreBalance;

    private Integer balance;

    private String name;

    private Integer isRealName;

    private Integer isRealMobile;

    private String cid;


}
