package cn.community.service;

import cn.community.c_interface.MaintainService;
import cn.community.mapper.MaintainMapper;
import cn.community.pojo.Maintain;
import cn.community.pojo.MaintainExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintainServiceImpl implements MaintainService {
    @Autowired
    MaintainMapper maintainMapper;

    public Maintain getMaintainByownId(Integer owerId) {
        MaintainExample maintainExample = new MaintainExample();
        maintainExample.createCriteria().andOwnerIdEqualTo(owerId);
        List<Maintain> maintains = maintainMapper.selectByExampleWithBLOBs(maintainExample);
        if (maintains.size() > 0) {
            return maintains.get(0);

        } else {
            return new Maintain();
        }
    }
}
