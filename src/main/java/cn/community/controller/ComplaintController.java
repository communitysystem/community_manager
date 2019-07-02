package cn.community.controller;

import cn.community.c_interface.ComplaintService;
import cn.community.pojo.Complaint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.security.acl.Owner;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/complaint")
public class ComplaintController {
    @Autowired
    ComplaintService complaintService;

    @RequestMapping("/showAll")
    public String showAll(HttpSession session, Map<String, Object> map) {

        if (null == session) {
            return "redirect:/login";
        }
        Integer owerId = (Integer) session.getAttribute("userId");
        List<Complaint> allComplaint = complaintService.getAllComplaint(owerId);
        map.put("allComplaint", allComplaint);
        return "complaint";
    }

    @RequestMapping("/delById")
    public String delComplantById(String id) {
        try {
            complaintService.delComplantById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/login";
        }

        return "redirect:/showAll";
    }

    @RequestMapping("/updata")
    public String upData(Complaint complaint) {


        return "redirect:/showAll";

    }
}
