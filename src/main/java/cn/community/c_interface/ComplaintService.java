package cn.community.c_interface;


import cn.community.pojo.Complaint;

import java.util.List;

public interface ComplaintService {
    public Complaint getComplaintByOwnId(Integer ownerId);

    public List<Complaint> getAllComplaint(Integer ownerId);

    void delComplantById(String id) throws Exception;
}
