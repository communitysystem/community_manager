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

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    @Override
    public String login(User user) {
        int role = user.getRole();
        Integer name;
        try {
            name = Integer.valueOf(user.getUserName());

        } catch (Exception e) {
            return "账号为数字";
        }

        switch (role) {
            case 1: {
                Manager manager = managerMapper.selectByPrimaryKey(name);
                if (manager == null) {
                    return "账号错误";
                } else if (!manager.getManagerPassword().equals(user.getPassword())) {
                    return "密码错误";
                } else {
//                    int ownerId = user.getUserName();
                    return "redirect:/index";
                }
            }
//是业主
            case 2: {
                HOwner hOwner = hOwnerMapper.selectByPrimaryKey(name);
                if (hOwner == null) {
                    return "账号错误";
                } else if (!hOwner.getOwnerPassword().equals(user.getPassword())) {
                    return "密码错误";
                } else {
                    return "redirect:/index/"+hOwner.getOwnerId();
                }
            }
            case 3: {
                Staff staff = staffMapper.selectByPrimaryKey(name);
                if (staff == null) {
                    return "账号错误";
                } else if (!staff.getStaffName().equals(user.getPassword())) {
                    return "密码错误";
                } else {
                    return "redirect:/index";
                }
            }
        }

        return null;
    }

    /**
     * 业主注册
     *
     * @param hOwner
     * @return
     */
    @Override
    public String signIn(HOwner hOwner) {
        int insertResult = hOwnerMapper.insert(hOwner);
        if (insertResult <= 0) {
            return "注册失败";
        }
        return "login";
    }
}
