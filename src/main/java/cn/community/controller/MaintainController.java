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
}
