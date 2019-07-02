package cn.community.controller;

import cn.community.c_interface.NewsService;
import cn.community.pojo.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    NewsService newsService;

    @RequestMapping("/all")
    public String getAllNews(Map<String, Object> map) {
        List<News> allNews = newsService.getAllNews();
        map.put("all", allNews);
        return "index";
    }
}
