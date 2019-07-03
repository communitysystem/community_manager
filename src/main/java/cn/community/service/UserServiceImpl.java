package cn.community.service;

import cn.community.c_interface.UserService;
import cn.community.mapper.HOwnerMapper;
import cn.community.mapper.ManagerMapper;
import cn.community.mapper.StaffMapper;
import cn.community.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    ManagerMapper managerMapper;
    @Autowired
    StaffMapper staffMapper;
    @Autowired
    HOwnerMapper hOwnerMapper;

    /**
     * 用户登录
     * @param user
     * @return
     */
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
                    return "managerIndex";
                }
            }

            case 2:{
                HOwner hOwner = hOwnerMapper.selectByPrimaryKey(name);
                if(hOwner == null){
                    return "账号错误";
                }else if(!hOwner.getOwnerPassword().equals(user.getPassword())){
                    return "密码错误";
                }else {
                    return "redirect:/index";
                }
            }
            case 3:{
                Staff staff = staffMapper.selectByPrimaryKey(name);
                if(staff == null){
                    return "账号错误";
                }else if(!staff.getStaffName().equals(user.getPassword())){
                    return "密码错误";
                }else {
                    return "/index";
                }
            }
        }

        return null;
    }

    /**
     * 业主注册
     * @param hOwner
     * @return
     */
    @Override
    public RegisterResult signIn(HOwner hOwner) {

        int insert = hOwnerMapper.insert(hOwner);
        RegisterResult registerResult = new RegisterResult();
        if(insert <= 0){
           registerResult.setMsg("注册失败");
        }else{
            registerResult.setMsg("login");
            registerResult.setUserName(hOwner.getOwnerId());
        }

        return registerResult;
    }

    /**
     * 按业主的id他的个人信息
     * @param ownerId
     * @return
     */
    @Override
    public HOwner searchById(int ownerId) {
        HOwner hOwner = hOwnerMapper.selectByPrimaryKey(ownerId);
        return hOwner;
    }

}
