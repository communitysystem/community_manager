package cn.community;

import cn.community.c_interface.NewsService;
import cn.community.pojo.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommunityManageApplicationTests {

    @Autowired
    NewsService newsService;

    @Test
    public void contextLoads() {
        List<News> allNews = newsService.getAllNews();
        System.out.println("allNews = " + allNews);
    }

}
