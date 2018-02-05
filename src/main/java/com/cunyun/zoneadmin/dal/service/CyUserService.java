package com.cunyun.zoneadmin.dal.service;

import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyUser;
import com.cunyun.zoneadmin.dto.CyUserDto;

public interface CyUserService {
    void userList(Page<CyUserDto> page, CyUserDto cyUserDto);

    void updateSattus(CyUser cyUser);

    void addUser(CyUser cyUser);

    void editUser(CyUserDto cyUserDto);

    void updateUserType(CyUser cyUser);

    CyUserDto queryById(Integer id);

    void updateVerifyInfo(CyUserDto cyUserDto);

    void blackList(Page<CyUserDto> page, CyUserDto cyUserDto);
}
