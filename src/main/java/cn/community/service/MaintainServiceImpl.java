package cn.community.service;

import cn.community.c_interface.MaintainService;
import cn.community.mapper.MaintainMapper;
import cn.community.pojo.Maintain;
import cn.community.pojo.MaintainExample;
import cn.community.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
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

    @Override
    public List<Maintain> getAllMainByHId(Integer owerId) {
        MaintainExample maintainExample = new MaintainExample();
        maintainExample.createCriteria().andOwnerIdEqualTo(owerId);
        List<Maintain> maintains = maintainMapper.selectByExampleWithBLOBs(maintainExample);
        return maintains;
    }

    @Override
    public void delById(String id) {
        MaintainExample example = new MaintainExample();
        example.createCriteria().andMaintainIdEqualTo(id);
        maintainMapper.deleteByExample(example);
    }

    @Override
    public void updateByMaintanId(String maintainId, String maintainInfo) throws Exception {
//        maintainMapper
        maintainMapper.updateByMaintanId(maintainId, maintainInfo);
    }

    @Override
    public void add(String maintainInfo, Integer ownerId) throws Exception {
        Maintain maintain = new Maintain();
//      用户输入的保修内容
        maintain.setMaintainInfo(maintainInfo);
        String itemId = IDUtils.genItemId();
//        生成主鍵
        maintain.setMaintainId(itemId);
        maintain.setOwnerId(ownerId);
        maintainMapper.insert(maintain);
    }
}
