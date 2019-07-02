package cn.community.controller;

import cn.community.c_interface.*;
import cn.community.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/index/{OwnerId}")
    public String loadData(@PathVariable("OwnerId") Integer ownerId, Map<String, Object> map) {
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
