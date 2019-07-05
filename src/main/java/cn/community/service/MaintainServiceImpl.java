package cn.community.service;

import cn.community.c_interface.MaintainService;
import cn.community.mapper.HOwnerMapper;
import cn.community.mapper.MaintainMapper;
import cn.community.mapper.StaffMapper;
import cn.community.pojo.HOwner;
import cn.community.pojo.Maintain;
import cn.community.pojo.MaintainExample;
import cn.community.pojo.Staff;
import cn.community.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class MaintainServiceImpl implements MaintainService {
    @Autowired
    MaintainMapper maintainMapper;
    @Autowired
    HOwnerMapper hOwnerMapper;
    @Autowired
    StaffMapper staffMapper;

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

    @Override
    public List<Maintain> queryAllMaintain() {
        MaintainExample exaple = new MaintainExample();
        MaintainExample.Criteria criteria = exaple.createCriteria();
        criteria.andMaintainIdIsNotNull();
        List<Maintain> maintains = maintainMapper.selectByExampleWithBLOBs(exaple);
        for(Maintain m : maintains){

            Integer ownerId = m.getOwnerId();
            Integer staffId = m.getStaffId();
            HOwner hOwner = hOwnerMapper.selectByPrimaryKey(ownerId);
            if(hOwner != null){
                m.setOwnerName(hOwner.getOwnerName());
             }

            Staff staff = staffMapper.selectByPrimaryKey(staffId);
            if(staff != null){
                m.setStaffName(staff.getStaffName());
            }
        }

        return maintains;
    }

    /**
     * 删除维修
     */
    @Override
    public void deleteMaintain(String maintainId) {
        maintainMapper.deleteByPrimaryKey(maintainId);
    }

    @Override
    public void rebackMaintain(String maintainId, String comment) {
        Maintain maintain = null ;
        MaintainExample example = new MaintainExample();
        MaintainExample.Criteria criteria = example.createCriteria();
        criteria.andMaintainIdEqualTo(maintainId);
        List<Maintain> maintains = maintainMapper.selectByExampleWithBLOBs(example);
        if(maintains != null && maintains.size()>0){
            maintain = maintains.get(0);
        }
        maintain.setFeedback(comment);
        MaintainExample example1 = new MaintainExample();
        MaintainExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andMaintainIdEqualTo(maintainId);
        maintainMapper.updateByExampleSelective(maintain,example1);
    }
}
