package cn.community.controller;

import cn.community.c_interface.CarPortService;
import cn.community.mapper.HOwnerMapper;
import cn.community.pojo.CarPort;
import cn.community.pojo.HOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    CarPortService carPortService;
    @Autowired
    HOwnerMapper hOwnerMapper;


    @RequestMapping("/allCarPort")
    public String loadData(int start,HttpSession session, Map<String,Object> map){
        //查询车位的所有信息
        List<CarPort> carPorts = carPortService.selectAllCarPort(start);
        map.put("carPorts",carPorts);
        //统计车位的个数
        long count = carPortService.countAll();
        map.put("count",count);
        map.put("pages",(int)(Math.ceil(count/11)));
        return  "all-carPort-manage-list";
    }
}
