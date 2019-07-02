package cn.community.controller;

import cn.community.c_interface.*;
import cn.community.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    NewsService newsService;
    @Autowired
    CarPortService carPortService;
    @Autowired
    ArrearageService arrearageService;

    @Autowired
    ComplaintService complaintService;
    @Autowired
    MaintainService maintainService;

    @RequestMapping("/index")
    public String loadData(Map<String, Object> map, HttpSession session) {
//        将session中的内容取出来
        if (null == session) {
            return "redirect:/login";
        }
        Integer ownerId = (Integer) session.getAttribute("userId");
//        获取所有的新闻数据
        List<News> allNews = newsService.getAllNews();
//      获取用户的停车信息
        CarPort carPortByHid = carPortService.getCarPortByHid(ownerId);


//        获取用户的欠费信息
        Arrearage arrearageByHId = arrearageService.getArrearageByHId(ownerId);

//        投诉信息
        Complaint complaintByOwnId = complaintService.getComplaintByOwnId(ownerId);

//        保修信息
        Maintain maintainByownId = maintainService.getMaintainByownId(ownerId);
        map.put("all", allNews);
        map.put("car", carPortByHid);
        map.put("arrearage", arrearageByHId);
        map.put("complaint", complaintByOwnId);
        map.put("maintain", maintainByownId);

//        System.out.println("map = " + map);
        return "index";
    }
}
