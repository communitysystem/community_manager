package cn.community.controller;

import cn.community.c_interface.StaffService;
import cn.community.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    StaffService staffService;

    @RequestMapping("/getAll")
    public String getAll(Map<String, java.lang.Object> map) {
        List<Staff> allStaff = staffService.getALl();
        map.put("all", allStaff);
        return "staffManage";
    }

    @RequestMapping("/delById")
    public String delById(Integer id) {
        staffService.delById(id);
        return "redirect:/staff/getAll";
    }

    /**
     * 跳转到编辑界面并携带数据
     *
     * @param id
     * @param map
     * @return
     */
    @RequestMapping("/updataPage")
    public String upData(Integer id, Map<String, Object> map) {
        Staff staff = staffService.selectById(id);
        map.put("staff", staff);
        return "StaffEdit";
    }

    @RequestMapping("/updata")
    public String updata(Staff staff) {
        staffService.upData(staff);
        return "redirect:/staff/getAll";
    }

    @RequestMapping("/add")
    public String add(Staff staff) {
        staffService.add(staff);
        return "redirect:/staff/getAll";

    }
}
