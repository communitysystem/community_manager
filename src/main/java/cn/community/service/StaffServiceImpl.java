package cn.community.service;

import cn.community.c_interface.StaffService;
import cn.community.mapper.StaffMapper;
import cn.community.pojo.Staff;
import cn.community.pojo.StaffExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffMapper staffMapper;

    /**
     * 根据员工的id查询所有的信息
     *
     * @param id
     * @return
     */
    @Override
    public Staff selectById(int id) {
        return staffMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Staff> getALl() {
        StaffExample staffExample = new StaffExample();
        staffExample.createCriteria().andStaffIdIsNotNull();
        List<Staff> staffList = staffMapper.selectByExample(staffExample);
        return staffList;
    }

    @Override
    public void delById(Integer id) {
        staffMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void upData(Staff staff) {
        staffMapper.updateByPrimaryKey(staff);
    }

    @Override
    public void add(Staff staff) {
        staffMapper.insert(staff);
    }
}
