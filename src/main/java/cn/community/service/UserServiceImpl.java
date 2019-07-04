package cn.community.service;

import cn.community.c_interface.UserService;
import cn.community.mapper.HOwnerMapper;
import cn.community.mapper.HouseMapper;
import cn.community.mapper.ManagerMapper;
import cn.community.mapper.StaffMapper;
import cn.community.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    ManagerMapper managerMapper;
    @Autowired
    StaffMapper staffMapper;
    @Autowired
    HOwnerMapper hOwnerMapper;
    @Autowired
    HouseMapper houseMapper;

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
                    return "redirect:/index";
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

    /**
     * 查询所有的业主信息
     * @return
     */
    @Override
    public List<HOwner> selectAllOwner() {
        HOwnerExample example = new HOwnerExample();
        HOwnerExample.Criteria criteria = example.createCriteria();
        criteria.andOwnerIdIsNotNull();
        List<HOwner> hOwners = hOwnerMapper.selectByExample(example);
        for(HOwner h : hOwners){
            if("male".equals(h.getSex())){
                h.setSex("男");
            }else {
                h.setSex("女");
            }
            HouseExample example1 = new HouseExample();
            HouseExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andOwnerIdEqualTo(h.getOwnerId());
            List<House> houses = houseMapper.selectByExample(example1);
            if(houses != null && houses.size() > 0){
                h.setHouseInfo(houses.get(0).getHouseId());
            }

        }

        return hOwners;
    }

    /**
     * 删除业主
     * @param ownerId
     */
    @Override
    public void deleteOwner(int ownerId) {
        hOwnerMapper.deleteByPrimaryKey(ownerId);
    }
    /**
     * 更新业主信息
     */
    @Override
    public void updateOwner(HOwner hOwner) {
        hOwnerMapper.updateByPrimaryKeySelective(hOwner);
    }




}
