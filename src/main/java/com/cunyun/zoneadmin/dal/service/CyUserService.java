package com.cunyun.zoneadmin.dal.service;

import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyUser;
import com.cunyun.zoneadmin.dto.CyUserDto;

public interface CyUserService {
    void userList(Page<CyUserDto> page, CyUser cyUser);

    void updateSattus(CyUser cyUser);

    void addUser(CyUser cyUser);

    void editUser(CyUser cyUser);

    void updateUserType(CyUser cyUser);
}