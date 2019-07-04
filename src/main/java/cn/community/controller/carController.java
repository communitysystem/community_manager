package cn.community.controller;

import cn.community.c_interface.CarPortService;
import cn.community.pojo.CarPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/carport")
public class carController {
    @Autowired
    CarPortService carPortService;

    @RequestMapping("/showCarPort")
    public String showInfoByownerId(HttpSession session, Map<String, Object> map) {
        Integer ownerId = (Integer) session.getAttribute("userId");
        if (null == ownerId) {
            return "redirect:/login";
        }
//        將用户车库的信息查询出来
        CarPort portByHid = carPortService.getCarPortByHid(ownerId);
        map.put("car", portByHid);

        return "carPortInfo";
    }

    @RequestMapping("/appaly")
    public String appaly(CarPort carPort) {
        try {
            carPortService.appaly(carPort);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
