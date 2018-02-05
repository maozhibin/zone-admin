package com.cunyun.zoneadmin.controller.user;


import com.cunyun.zoneadmin.common.JsonResponseMsg;
import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyUser;
import com.cunyun.zoneadmin.dal.service.CyUserService;
import com.cunyun.zoneadmin.dto.CyUserDto;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private CyUserService cyUserService;
    /**
     * 用户列表
     */
    @RequestMapping(value = "userList" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg userList(@RequestParam(defaultValue = "10", required = false) Integer limit,
                                    @RequestParam(defaultValue = "1", required = false) Integer offset, @RequestBody CyUserDto cyUserDto){
        JsonResponseMsg result = new JsonResponseMsg();
        Page<CyUserDto> page = new Page<>(limit, offset);
        cyUserService.userList(page,cyUserDto);
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"查出成功",map);
    }

    /**
     * 修改用户状态
     */
    @RequestMapping(value = "updateSattus" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg updateSattus(@RequestBody CyUser cyUser){
        JsonResponseMsg result = new JsonResponseMsg();
        cyUserService.updateSattus(cyUser);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"修改成功");
    }

    /**
     * 编辑或者添加用户
     */
    @RequestMapping(value = "editOrUpdateUser" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg editOrUpdateUser(@RequestBody CyUserDto cyUserDto){
        JsonResponseMsg result = new JsonResponseMsg();
        if(cyUserDto.getId()==null){
            return result.fill(JsonResponseMsg.CODE_FAIL,"参数错误");
//            cyUserService.addUser(cyUser);
        }else{
            cyUserService.editUser(cyUserDto);
        }
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"修改成功");
    }


    /**
     * 修改用户类型
     */
    @RequestMapping(value = "updateUserType" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg updateUserType(@RequestBody CyUser cyUser){
        JsonResponseMsg result = new JsonResponseMsg();
        cyUserService.updateUserType(cyUser);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"修改成功");
    }


    /**
     * 审核信息
     */
    @RequestMapping(value = "verifyInfo" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg verifyInfo(Integer id){
        JsonResponseMsg result = new JsonResponseMsg();
        if(id == null){
            return result.fill(JsonResponseMsg.CODE_FAIL,"参数错误");
        }
        CyUserDto cyUserDto = cyUserService.queryById(id);
        Map<String,Object> map = new HashMap<>();
        map.put("user",cyUserDto);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"查询成功",map);
    }

    /**
     * 审核通过或者拒绝
     */
    @RequestMapping(value = "updateVerifyInfo" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg updateVerifyInfo(@RequestBody CyUserDto cyUserDto){
        JsonResponseMsg result = new JsonResponseMsg();
        if(cyUserDto.getId() == null){
            return result.fill(JsonResponseMsg.CODE_FAIL,"参数错误");
        }
        cyUserService.updateVerifyInfo(cyUserDto);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"修改成功");
    }

    /**
     * 黑名单列表
     */
    @RequestMapping(value = "blackList" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg blackList(@RequestParam(defaultValue = "10", required = false) Integer limit,
                                    @RequestParam(defaultValue = "1", required = false) Integer offset, @RequestBody CyUserDto cyUserDto){
        JsonResponseMsg result = new JsonResponseMsg();
        Page<CyUserDto> page = new Page<>(limit, offset);
        cyUserService.blackList(page,cyUserDto);
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"查出成功",map);
    }


    /**
     * 用户邀请信息列表
     */
    @RequestMapping(value = "userInviteInfoList" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg userInviteInfoList(@RequestParam(defaultValue = "10", required = false) Integer limit,
                                     @RequestParam(defaultValue = "1", required = false) Integer offset, @RequestBody CyUserDto cyUserDto){
        JsonResponseMsg result = new JsonResponseMsg();
        Page<CyUserDto> page = new Page<>(limit, offset);
        cyUserService.userInviteInfoList(page,cyUserDto);
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"查出成功",map);
    }

    /**
     * 根据邀请码查询用户邀请成员的信息
     */
    @RequestMapping(value = "queryIniviteUidUser" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg queryIniviteUidUser(@RequestParam(defaultValue = "10", required = false) Integer limit,
                                              @RequestParam(defaultValue = "1", required = false) Integer offset, @RequestBody CyUserDto cyUserDto){
        JsonResponseMsg result = new JsonResponseMsg();
        Page<CyUserDto> page = new Page<>(limit, offset);
        cyUserService.queryIniviteUidUser(page,cyUserDto);
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"查出成功",map);
    }


}
