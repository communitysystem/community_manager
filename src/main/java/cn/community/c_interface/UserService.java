package cn.community.c_interface;

import cn.community.pojo.HOwner;
import cn.community.pojo.RegisterResult;
import cn.community.pojo.User;
import org.apache.logging.log4j.message.Message;

import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 用户登录方法
     * @param user
     * @return
     */
    public String login (User user);

    /**
     * 业主这册
     * @param hOwner
     * @return
     */
    public RegisterResult signIn(HOwner hOwner);
    /**
     * 根据用户id查询所有的用户信息
     */
    public HOwner searchById(int ownerId);

    /**
     * 查询所有的业主信息
     */
    public List<HOwner> selectAllOwner();

    /**
     * 删除用户
     */
    public void deleteOwner(int ownerId);

    /**
     * 更新业主信息
     * @param hOwner
     */
    public void updateOwner(HOwner hOwner);
}
