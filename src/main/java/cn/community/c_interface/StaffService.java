package cn.community.c_interface;

import cn.community.pojo.Staff;

public interface StaffService {
    /**
     * 通过用户id查询所有的信息
     * @param id
     * @return
     */
    public Staff selectById(int id);
}
