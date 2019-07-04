package cn.community.controller;

import cn.community.c_interface.ComplaintService;
import cn.community.pojo.Complaint;
import cn.community.pojo.HOwner;
import cn.community.utils.IDUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.input.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.lang.model.SourceVersion;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.security.acl.Owner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/complaint")
public class ComplaintController {
    @Autowired
    ComplaintService complaintService;

    @RequestMapping("/showAll")
    public String showAll(HttpSession session, Map<String, Object> map) {
        Integer owerId = (Integer) session.getAttribute("userId");
        if (null == owerId) {
            return "redirect:/login";
        }
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

        return "redirect:/complaint/showAll";
    }

    @RequestMapping("/updata")
    public String upData(String complaintId, String complaintComment) {
        try {
            complaintService.upDataComplantById(complaintId, complaintComment);
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/error";
        }

        return "redirect:/complaint/showAll";

    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestBody String complaintComment, HttpSession session) {
        if (null == session) {
            return "redirect:/login";
        }
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String dateFormat = sdf.format(now);
        Date now = new Date();
//      从session中获取用户
        Integer ownerId = (Integer) session.getAttribute("userId");
        Complaint complaint = new Complaint();
        complaint.setComplaintComment(complaintComment);
        complaint.setComplaintDate(now);
        complaint.setOwnerId(ownerId);
        complaint.setComplaintId(IDUtils.genItemId());
        ObjectMapper mapper = new ObjectMapper();
        String resString = "";
        Map<String, Object> map = new HashMap<>();
        try {
            complaintService.addComplaintComment(complaint);
            resString = mapper.writeValueAsString(map);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("result", "投诉失败");
            return resString;
        }
        //        complaintService.addComplaintComment
        map.put("result", "投诉成功");
        return resString;
    }
}
