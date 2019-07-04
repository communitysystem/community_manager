package cn.community.c_interface;

import cn.community.pojo.Manager;

import javax.validation.constraints.Size;
import java.util.List;

public interface ManagerService {
    /**
     * 通过管理员的id查询所有的信息
     * @param id
     * @return
     */
    public Manager selectById(int id);


}
