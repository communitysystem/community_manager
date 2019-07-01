package cn.community.contronller;

import cn.community.mapper.HOwnerMapper;
import cn.community.pojo.HOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    HOwnerMapper owner;

    @RequestMapping("/a")
    public HOwner getById(Integer id) {
        return owner.selectByPrimaryKey(id);
    }
}
