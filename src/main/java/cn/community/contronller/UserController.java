package cn.community.contronller;

import cn.community.c_interface.UserService;
import cn.community.mapper.HOwnerMapper;
import cn.community.pojo.HOwner;
import cn.community.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(User user, Map<String, Object> map){
        String loginMsg = userService.login(user);
        if(loginMsg.equals("账号错误") || loginMsg.equals("密码错误") || loginMsg.equals("账号为数字")){
            map.put("msg",loginMsg);
            return "login";
        }
        return loginMsg;
    }

    @RequestMapping("/signIn")
    public String signIn(HOwner hOwner,Map<String,Object> map){
        String msg =  userService.signIn(hOwner);
        if("login".equals(msg)){
            return "login";
        }else {
            map.put("msg",msg);
            return "hower_register";
        }


    }
}
