package cn.community.service;


import cn.community.c_interface.ComplaintService;
import cn.community.mapper.ComplaintMapper;
import cn.community.mapper.HOwnerMapper;
import cn.community.pojo.Complaint;
import cn.community.pojo.ComplaintExample;
import cn.community.pojo.HOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintServiceImpl implements ComplaintService {
    @Autowired
    ComplaintMapper complaintMapper;
    @Autowired
    HOwnerMapper hOwnerMapper;

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

    @Override
    public List<Complaint> getAllComplaint(Integer ownerId) {
        ComplaintExample complaintExample = new ComplaintExample();
        complaintExample.createCriteria().andOwnerIdEqualTo(ownerId);
        List<Complaint> complaints = complaintMapper.selectByExampleWithBLOBs(complaintExample);
        return complaints;
    }

    @Override
    public void delComplantById(String id) {
        complaintMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void upDataComplantById(String complaintId, String complaintComment) throws Exception {
        complaintMapper.updateByPriMaryKeyAndComment(complaintId, complaintComment);
    }

    @Override
    public void addComplaintComment(Complaint complaint) throws Exception {
        complaintMapper.insert(complaint);
    }

    /**
     * 查询出所有的投诉
     * @return
     */
    @Override
    public List<Complaint> selectAllComplaint() {
        ComplaintExample example = new ComplaintExample();
        ComplaintExample.Criteria criteria = example.createCriteria();
        criteria.andComplaintIdIsNotNull();
        List<Complaint> complaints = complaintMapper.selectByExampleWithBLOBs(example);
        for(Complaint c : complaints){
            HOwner hOwner = hOwnerMapper.selectByPrimaryKey(c.getOwnerId());
            if(hOwner != null){
                c.setComplainterName(hOwner.getOwnerName());
            }

        }
        return complaints;
    }

    @Override
    public void deleteComplaint(String complaintId) {
        complaintMapper.deleteByPrimaryKey(complaintId);
    }

    @Override
    public void rebackComplaint(String complaintId, String content) {
        Complaint complaint = new Complaint();
        ComplaintExample example = new ComplaintExample();
        ComplaintExample.Criteria criteria = example.createCriteria();
        criteria.andComplaintIdEqualTo(complaintId);
        List<Complaint> complaints = complaintMapper.selectByExampleWithBLOBs(example);
        complaint = complaints.get(0);
        complaint.setComplaintId(complaintId);
        complaint.setFeedback(content);
        complaintMapper.updateByPrimaryKeySelective(complaint);
    }
}
