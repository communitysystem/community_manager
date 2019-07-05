package cn.community.controller;

import cn.community.c_interface.ArrearageService;
import cn.community.pojo.Arrearage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/arrearage")
public class ArrearageController {

    @Autowired
    ArrearageService arrearageService;

    @RequestMapping("/getAll")
    public String getAll(Map<String, Object> map) {
        List<Arrearage> all = arrearageService.getAll();
        map.put("all", all);
        return "arrearageList";
    }

    @RequestMapping("/delById")
    public String delById(String id) {
        arrearageService.delById(id);
        return "redirect:/arrearage/getAll";
    }
}
