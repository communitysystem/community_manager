package cn.community.controller;

import cn.community.c_interface.MaintainService;
import cn.community.pojo.Maintain;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/maintain")
public class MaintainController {

    @Autowired
    MaintainService maintainService;

    @RequestMapping("/getAll")
    public String getAllById(HttpSession session, Map<String, Object> map) {
        Integer userId = (Integer) session.getAttribute("userId");
        if (null == userId) {
            return "redirect:/login";
        }

        List<Maintain> allMainByHId = maintainService.getAllMainByHId(userId);
        map.put("maintain", allMainByHId);
        return "maintain";
    }

    @RequestMapping("/delById")
    public String delById(String id) {
        maintainService.delById(id);
        return "redirect:/maintain/getAll";
    }

    //根据maintainid修改其中的值
    @RequestMapping("/update")
    public String upDate(String maintainId, String maintainInfo) {
        System.out.println("maintainId = " + maintainId);
        System.out.println("maintainInfo = " + maintainInfo);
        try {
            maintainService.updateByMaintanId(maintainId, maintainInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/index";
        }
        return "redirect:/maintain/getAll";
    }

    @ResponseBody
    @RequestMapping("/add")
    public String add(@RequestBody String maintainInfo, HttpSession session) {
        Integer id = (Integer) session.getAttribute("userId");
        Map<String, Object> map = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        String resString = "";
        try {
            maintainService.add(maintainInfo, id);
            map.put("result", "投诉成功");
            resString = mapper.writeValueAsString(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resString;
    }

    /**
     * 查询所有的维修
     */
    @RequestMapping("/queryAllMaintian")
    public String queryAllMaintain(Map<String,Object> map){

        List<Maintain> maintains = maintainService.queryAllMaintain();
        map.put("maintains",maintains);
        return "allMaintain";

    }
    /**
     * 删除维修
     */
    @RequestMapping("/deleteMaintain")
    public String deleteMaintain(String maintainId){
        maintainService.deleteMaintain(maintainId);
        return "redirect:/maintain/queryAllMaintian";
    }

    /**
     * 回复维修
     */
    @RequestMapping("/reback")
    public String reback(String maintainId,Map<String,Object> map){
        map.put("maintainId",maintainId);
        return "rebackMaintain";
    }
    @RequestMapping("/rebackMaintian")
    public String rebackMaintain(String maintainId,String feedback){
        System.out.println(maintainId);
        System.out.println(feedback);
            maintainService.rebackMaintain(maintainId,feedback);
        return "redirect:/maintain/queryAllMaintian";
    }
}
