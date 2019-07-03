package cn.community;

import cn.community.c_interface.*;
import cn.community.pojo.*;
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

    @Autowired
    CarPortService carPortService;
    @Autowired
    ArrearageService arrearageService;

    @Autowired
    ComplaintService complaintService;

    @Autowired
    MaintainService maintainService;



    @Test
    public void contextLoads() {
        List<News> allNews = newsService.getAllNews();
        System.out.println("allNews = " + allNews);
    }

    @Test
    public void testCarPortService() {

        CarPort carPortByHid = carPortService.getCarPortByHid(5909);
        System.out.println("carPortByHid = " + carPortByHid);
    }

    @Test
    public void testArrearageService() {

        Arrearage arrearageByHId = arrearageService.getArrearageByHId(5901);
        System.out.println("arrearageByHId = " + arrearageByHId);
    }

    @Test
    public void testComplaintService() {
        Complaint complaintByOwnId = complaintService.getComplaintByOwnId(5901);
        System.out.println("complaintByOwnId = " + complaintByOwnId.getComplaintComment());
    }

    @Test
    public void testMaintainService() {
        Maintain maintainByownId = maintainService.getMaintainByownId(5900);
        System.out.println("maintainByownId = " + maintainByownId);
    }

    @Test
    public void countCarPort(){
        System.out.println(carPortService.countAll());
    }
}
