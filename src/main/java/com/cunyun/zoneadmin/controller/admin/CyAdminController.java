package com.cunyun.zoneadmin.controller.admin;

import com.cunyun.zoneadmin.common.CommonConstant;
import com.cunyun.zoneadmin.common.JsonResponseMsg;
import com.cunyun.zoneadmin.common.SymmetricEncoder;
import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyAdmin;
import com.cunyun.zoneadmin.dal.service.CyAdminService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("admin")
public class CyAdminController {
    @Resource
    private CyAdminService cyAdminService;

    /**
     * 登入
     * @return
     */
    @RequestMapping(value = "login" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg login(@RequestBody CyAdmin cyAdmin){
        JsonResponseMsg result = new JsonResponseMsg();
        String name = cyAdmin.getName();
        if(StringUtils.isEmpty(name) || StringUtils.isEmpty(cyAdmin.getPassword())){
            return result.fill(JsonResponseMsg.CODE_FAIL,"参数错误");
        }
        String pwd = cyAdmin.getPassword();
        String password = SymmetricEncoder.AESEncode(pwd);//加密
        CyAdmin newAdmin = cyAdminService.queryByName(name);
        if(newAdmin==null){
            return result.fill(JsonResponseMsg.CODE_FAIL,"改账号不存在");
        }
        if(!CommonConstant.DB_STATUS_DELETE.equals(newAdmin.getStatus())){
            return result.fill(JsonResponseMsg.CODE_FAIL,"该账号已经被冻结");
        }

        if(!name.equals(newAdmin.getName()) || !password.equals(newAdmin.getPassword())){
            return result.fill(JsonResponseMsg.CODE_FAIL,"账号名或者密码错误");
        }
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"认证成功");
    }

    /**
     *管理员添加
     */
    @RequestMapping(value = "addAdmin" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg addAdmin(@RequestBody CyAdmin cyAdmin){
        JsonResponseMsg result = new JsonResponseMsg();
        if(StringUtils.isEmpty(cyAdmin.getPassword())){
            return result.fill(JsonResponseMsg.CODE_FAIL,"请传入正确的数据");
        }
        if(StringUtils.isEmpty(cyAdmin.getName())){
            return result.fill(JsonResponseMsg.CODE_FAIL,"请传入正确的数据");
        }
        CyAdmin admin = cyAdminService.queryByName(cyAdmin.getName());
        if(admin!=null){
            return result.fill(JsonResponseMsg.CODE_FAIL,"该管理员已经存在");
        }
        cyAdmin.setCreatedTime(new Date());
        cyAdmin.setUpdateTime(new Date());
        cyAdminService.insert(cyAdmin);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"添加成功");
    }


    /**
     *管理员修改
     */
    @RequestMapping(value = "updateAdmin" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg updateAdmin(@RequestBody CyAdmin cyAdmin){
        JsonResponseMsg result = new JsonResponseMsg();
        if(StringUtils.isEmpty(cyAdmin.getPassword())){
            return result.fill(JsonResponseMsg.CODE_FAIL,"请传入正确的数据");
        }
        if(StringUtils.isEmpty(cyAdmin.getName())){
            return result.fill(JsonResponseMsg.CODE_FAIL,"请传入正确的数据");
        }
        cyAdmin.setUpdateTime(new Date());
        cyAdminService.update(cyAdmin);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"修改成功");
    }

    /**
     * 管理员列表
     */
    @RequestMapping(value = "adminList" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg adminList(@RequestParam(defaultValue = "10", required = false) Integer limit,
                                    @RequestParam(defaultValue = "1", required = false) Integer offset, @RequestBody CyAdmin cyAdmin){
        JsonResponseMsg result = new JsonResponseMsg();
        Page<CyAdmin> page = new Page<>(limit, offset);
        cyAdminService.adminList(page,cyAdmin);
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"查出成功",map);
    }


    /**
     * 修改管理员的状态
     */
    @RequestMapping(value = "UpdateStatus" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg UpdateStatus(@RequestBody CyAdmin cyAdmin){
        JsonResponseMsg result = new JsonResponseMsg();
        cyAdminService.update(cyAdmin);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"修改成功");
    }


}
