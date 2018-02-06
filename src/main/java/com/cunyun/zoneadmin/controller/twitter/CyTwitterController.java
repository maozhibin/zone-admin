package com.cunyun.zoneadmin.controller.twitter;

import com.cunyun.zoneadmin.common.JsonResponseMsg;
import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyTwitter;
import com.cunyun.zoneadmin.dal.service.CyTwitterService;
import com.cunyun.zoneadmin.dto.CyTwitterDto;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("twitter")
public class CyTwitterController {
    @Resource
    private CyTwitterService cyTwitterService;
    /**
     * 帖子列表
     */
    @RequestMapping(value = "twitterList" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg twitterList(@RequestParam(defaultValue = "10", required = false) Integer limit,
                                     @RequestParam(defaultValue = "1", required = false) Integer offset, @RequestBody CyTwitterDto cyTwitterDto){
        JsonResponseMsg result = new JsonResponseMsg();
        Page<CyTwitterDto> page = new Page<>(limit, offset);
        cyTwitterService.twitterList(page,cyTwitterDto);
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"查出成功",map);
    }

    /**
     * 删除帖子
     */
    @RequestMapping(value = "delete" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg delete(Integer id){
        JsonResponseMsg result = new JsonResponseMsg();
        if(id==null){
            return result.fill(JsonResponseMsg.CODE_FAIL,"参数错误");
        }
        cyTwitterService.byIdDelete(id);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"删除成功");
    }


    /**
     * 修改帖子
     */
    @RequestMapping(value = "updatePushStatus" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg updatePushStatus(@RequestBody CyTwitterDto cyTwitterDto){
        JsonResponseMsg result = new JsonResponseMsg();
        if(cyTwitterDto.getId()==null){
            return result.fill(JsonResponseMsg.CODE_FAIL,"参数错误");
        }
        cyTwitterService.update(cyTwitterDto);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"查出成功");
    }
}
