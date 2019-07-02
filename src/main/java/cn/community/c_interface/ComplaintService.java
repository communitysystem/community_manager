package cn.community.c_interface;


import cn.community.pojo.Complaint;

public interface ComplaintService {
    public Complaint getComplaintByOwnId(Integer ownerId);
}
