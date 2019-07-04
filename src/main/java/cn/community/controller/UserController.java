package cn.community.controller;

import cn.community.c_interface.ManagerService;
import cn.community.c_interface.StaffService;
import cn.community.c_interface.UserService;
import cn.community.mapper.StaffMapper;
import cn.community.pojo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    ManagerService managerService;
    @Autowired
    StaffService staffService;
    @RequestMapping("/login")
    public String login(User user, Map<String, Object> map, HttpSession session){
        String loginMsg = userService.login(user);
        System.out.println(user.getRole());
        if(loginMsg.equals("账号错误") || loginMsg.equals("密码错误") || loginMsg.equals("账号为数字")){
            map.put("msg",loginMsg);
            return "login";
        }

        if(user.getRole() == 1){
            Manager manager = managerService.selectById(Integer.valueOf(user.getUserName()));
            session.setAttribute("user",manager);
        }else if(user.getRole() == 2){
            session.setAttribute("userId",Integer.valueOf(user.getUserName()));     //将用户的账号存到session中
            //查询出用户的信息
            HOwner hOwner = userService.searchById(Integer.valueOf(user.getUserName()));  //查询用户的信息
            session.setAttribute("user",hOwner);
        }else if(user.getRole() == 3){
            Staff staff = staffService.selectById(Integer.valueOf(user.getUserName()));
            session.setAttribute("user",staff);
        }


        return loginMsg;
    }

    @RequestMapping("/signIn")
    public String signIn(HOwner hOwner,Map<String,Object> map){
        RegisterResult registerResult =  userService.signIn(hOwner);
        String msg = registerResult.getMsg();

        if("login".equals(msg)){
            map.put("userId",registerResult.getUserName());
            map.put("warningInfo","这是您的账号，请牢记！");
            return "login";
        }else {
            map.put("msg",msg);

            return "hower_register";
        }


    }

    /**
     * 查询所有的业主信息
     */
    @RequestMapping("/allOwner")
    public String selectAllOWner(Map<String, Object> map){
        List<HOwner> hOwners = userService.selectAllOwner();
        map.put("hOwners",hOwners);
        return "allOwner";
    }

    /**
     * 删除业主
     * @param ownerId
     * @return
     */
    @RequestMapping("/deleteOwner")
    public String deleteOwner(String ownerId){
        System.out.println("hello");
        userService.deleteOwner(Integer.valueOf(ownerId));
        System.out.println(ownerId);
        return "redirect:/user/allOwner";
    }

    /**
     * 更业主信息
     * @param ownerId
     * @param map
     * @return
     */
    @RequestMapping("/updateOwner")
    public String  updateOwner(String ownerId, Map<String,Object> map){

        map.put("ownerId",ownerId);
        return "updateOwner";
    }
    @RequestMapping("/updateSubmit")
    public String updateOwnerSubmit(HOwner hOwner){
         
        System.out.println(hOwner.getOwnerId());
        userService.updateOwner(hOwner);
        System.out.println(hOwner.getOwnerId());
        System.out.println(hOwner.getOwnerName());
        System.out.println(hOwner.getSex());
        return "redirect:/user/allOwner";
    }
}
