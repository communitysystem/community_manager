package cn.community.c_interface;

import cn.community.pojo.Staff;

import java.util.List;

public interface StaffService {
    /**
     * 通过用户id查询所有的信息
     *
     * @param id
     * @return
     */
    public Staff selectById(int id);

    List<Staff> getALl();

    void delById(Integer id);

    void upData(Staff staff);

    void add(Staff staff);
}
