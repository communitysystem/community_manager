package cn.community.service;

import cn.community.c_interface.StaffService;
import cn.community.mapper.StaffMapper;
import cn.community.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffMapper staffMapper;

    /**
     * 根据员工的id查询所有的信息
     * @param id
     * @return
     */
    @Override
    public Staff selectById(int id) {
        return staffMapper.selectByPrimaryKey(id);
    }
}
