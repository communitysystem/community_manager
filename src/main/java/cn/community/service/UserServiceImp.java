package cn.community.service;

import cn.community.c_interface.UserService;
import cn.community.mapper.HOwnerMapper;
import cn.community.mapper.ManagerMapper;
import cn.community.mapper.StaffMapper;
import cn.community.pojo.HOwner;
import cn.community.pojo.Manager;
import cn.community.pojo.Staff;
import cn.community.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    ManagerMapper managerMapper;
    @Autowired
    StaffMapper staffMapper;
    @Autowired
    HOwnerMapper hOwnerMapper;
    @Override
    public String login(User user) {
        int role = user.getRole();
        Integer name;
        try {
            name = Integer.valueOf(user.getUserName());

        }catch (Exception e){
            return "账号为数字";
        }

        switch (role){
            case 1:{
                Manager manager = managerMapper.selectByPrimaryKey(name);
                if(manager == null){
                    return "账号错误";
                }else if(!manager.getManagerPassword().equals(user.getPassword())){
                    return "密码错误";
                }else {
                    return "index";
                }
            }

            case 2:{
                HOwner hOwner = hOwnerMapper.selectByPrimaryKey(name);
                if(hOwner == null){
                    return "账号错误";
                }else if(!hOwner.getOwnerPassword().equals(user.getPassword())){
                    return "密码错误";
                }else {
                    return "index";
                }
            }
            case 3:{
                Staff staff = staffMapper.selectByPrimaryKey(name);
                if(staff == null){
                    return "账号错误";
                }else if(!staff.getStaffName().equals(user.getPassword())){
                    return "密码错误";
                }else {
                    return "index";
                }
            }
        }

        return null;
    }
}
