package cn.community.c_interface;


import cn.community.pojo.Complaint;

import java.util.List;

public interface ComplaintService {
    public Complaint getComplaintByOwnId(Integer ownerId);

    public List<Complaint> getAllComplaint(Integer ownerId);

    void delComplantById(String id) throws Exception;

    void upDataComplantById(String complaintId, String complaintComment) throws Exception;

    void addComplaintComment(Complaint complaint) throws Exception;

    /**
     * 查询所有的投诉
     */
    public List<Complaint> selectAllComplaint();

    /**
     * 删除投诉
     */
    public void deleteComplaint(String complaintId);

    /**
     * 回复投诉
     * @param complaintId
     * @param content
     */
    public void rebackComplaint(String complaintId,String content);
}
