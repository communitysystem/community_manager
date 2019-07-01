package cn.community.c_interface;

import cn.community.pojo.User;
import org.apache.logging.log4j.message.Message;

public interface UserService {
    public String login (User user);
}
