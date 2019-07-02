package cn.community.service;


import cn.community.c_interface.ComplaintService;
import cn.community.mapper.ComplaintMapper;
import cn.community.pojo.Complaint;
import cn.community.pojo.ComplaintExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintServiceImpl implements ComplaintService {
    @Autowired
    ComplaintMapper complaintMapper;

    public Complaint getComplaintByOwnId(Integer ownerId) {
        ComplaintExample complaintExample = new ComplaintExample();
        complaintExample.createCriteria().andOwnerIdEqualTo(ownerId);
        List<Complaint> complaints = complaintMapper.selectByExampleWithBLOBs(complaintExample);
        if (complaints.size() > 0) {
            return complaints.get(0);
        } else {
            return new Complaint();
        }

    }
}
