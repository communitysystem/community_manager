package cn.community.c_interface;

import cn.community.pojo.HOwner;
import cn.community.pojo.User;
import org.apache.logging.log4j.message.Message;

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
    public String signIn(HOwner hOwner);
}
