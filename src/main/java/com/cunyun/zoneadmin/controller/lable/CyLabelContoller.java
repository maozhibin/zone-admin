package com.cunyun.zoneadmin.controller.lable;

import com.cunyun.zoneadmin.common.JsonResponseMsg;
import com.cunyun.zoneadmin.dal.ext.Page;
import com.cunyun.zoneadmin.dal.model.CyLabel;
import com.cunyun.zoneadmin.dal.service.CyLabelService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("lable")
public class CyLabelContoller {

    @Resource
    private CyLabelService cyLabelService;

    @RequestMapping(value = "lableList" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg lableList(@RequestParam(defaultValue = "10", required = false) Integer limit,
                                    @RequestParam(defaultValue = "1", required = false) Integer offset, @RequestBody CyLabel cyLabel){
        JsonResponseMsg result = new JsonResponseMsg();
        Page<CyLabel> page = new Page<>(limit, offset);
        cyLabelService.LableList(page,cyLabel);
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"查出成功",map);
    }

    /**
     * 不分页查询
     * @param cyLabel
     * @return
     */
    @RequestMapping(value = "lableCount" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg lableCount(@RequestBody CyLabel cyLabel){
        JsonResponseMsg result = new JsonResponseMsg();
        List<CyLabel> list =cyLabelService.lableCount(cyLabel);
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"查出成功",map);
    }

    /**
     * 根据id查询
     */
    @RequestMapping(value = "lableById" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg lableById(String id){
        JsonResponseMsg result = new JsonResponseMsg();
        String arrs[] = id.split(",");
        List<Integer> list1 = new ArrayList<>();
        for (String arr:arrs) {
            list1.add(Integer.parseInt(arr));
        }
        List<CyLabel> list = cyLabelService.lableById(list1);
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"查出成功",map);
    }

    /**
     * 编辑或者添加
     */
    @RequestMapping(value = "editOrUpdateLable" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResponseMsg editOrUpdateLable(@RequestBody CyLabel cyLabel){
        JsonResponseMsg result = new JsonResponseMsg();
        cyLabel.setCreatedTime(new Date());
        if(cyLabel.getId()==null){
            cyLabelService.addCyLabel(cyLabel);
        }else{
            cyLabelService.editCyLabel(cyLabel);
        }
        return result.fill(JsonResponseMsg.CODE_SUCCESS,"修改成功");
    }




}
