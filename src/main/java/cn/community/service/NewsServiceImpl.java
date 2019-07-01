package cn.community.service;

import cn.community.c_interface.NewsService;
import cn.community.mapper.NewsMapper;
import cn.community.pojo.News;
import cn.community.pojo.NewsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsMapper newsMapper;

    @Override
    public List<News> getAllNews() {

        NewsExample newsExample = new NewsExample();
        NewsExample.Criteria criteria = newsExample.createCriteria();
        criteria.andNewsDateIsNotNull();
        return newsMapper.selectByExampleWithBLOBs(newsExample);
    }

    @Override
    public News getNewsBycontent(String content) {
        return null;
    }
}
