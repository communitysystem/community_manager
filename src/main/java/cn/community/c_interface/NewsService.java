package cn.community.c_interface;

import cn.community.pojo.News;

import java.util.List;

public interface NewsService {
    public List<News> getAllNews();

    public News getNewsBycontent(String content);
}
