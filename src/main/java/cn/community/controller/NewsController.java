package cn.community.controller;

import cn.community.c_interface.NewsService;
import cn.community.pojo.Manager;
import cn.community.pojo.News;
import cn.community.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    NewsService newsService;

    /**
     * 用户显示的新闻
     *
     * @param map
     * @return
     */
    @RequestMapping("/all")
    public String getAllNews(Map<String, Object> map) {
        List<News> allNews = newsService.getAllNews();
        map.put("all", allNews);
        return "index";
    }

    /**
     * 管理员管理的新闻
     *
     * @param map
     * @return
     */
    @RequestMapping("/getAll")
    public String getAllManageNews(Map<String, Object> map) {
        List<News> allNews = newsService.getAllNews();
        map.put("all", allNews);
        return "newsManage";
    }

    @RequestMapping("/delById")
    public String delById(String newsId) {
        try {
            newsService.delById(newsId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/news/getAll";
    }

    @RequestMapping("/update")
    public String upDateById(String newsId, Map<String, Object> map) {
//        newsService.upDateById();
        News news = newsService.getNewsById(newsId);
        map.put("news", news);
        return "newsEdit";
    }

    @RequestMapping("/save")
    public String edit(HttpServletRequest request, HttpSession session) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年mm月dd日");
        Date date = null;
        date = dateFormat.parse(request.getParameter("newsDate"));
        News news = new News();
        news.setNewsDate(date);
        Manager manager = (Manager) session.getAttribute("user");
        news.setManagerId(manager.getManagerId());
        news.setNewsId(request.getParameter("newsId"));
        news.setNewCommnet(request.getParameter("newCommnet"));
        news.setTitle(request.getParameter("title"));
        newsService.save(news);

        return "redirect:/news/getAll";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request, HttpSession session) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年mm月dd日");
        Date date = null;
        date = dateFormat.parse(request.getParameter("newsDate"));
        News news = new News();
        news.setNewsDate(date);
        Manager manager = (Manager) session.getAttribute("user");
        news.setManagerId(manager.getManagerId());
        news.setNewsId(IDUtils.genItemId());
        news.setNewCommnet(request.getParameter("newCommnet"));
        news.setTitle(request.getParameter("title"));
        newsService.add(news);

        return "redirect:/news/getAll";
    }
}
