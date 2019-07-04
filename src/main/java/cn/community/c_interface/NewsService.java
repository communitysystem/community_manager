package cn.community.c_interface;

import cn.community.pojo.News;

import java.util.List;

public interface NewsService {
    public List<News> getAllNews();

    public News getNewsBycontent(String content);

    void delById(String newsId) throws Exception;

    News getNewsById(String newsId);

    void save(News news);

    void add(News news);
}
