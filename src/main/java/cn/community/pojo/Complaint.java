package cn.community.pojo;

import java.io.Serializable;
import java.util.Date;

public class Complaint implements Serializable {
    private String complaintId = "无投诉信息";

    private Integer ownerId;

    private Date complaintDate;

    private String complaintComment = "无";

    private String feedback = "暂未回复";

    public String getComplainterName() {
        return ComplainterName;
    }

    public void setComplainterName(String complainterName) {
        ComplainterName = complainterName;
    }

    //自己添加属性
    private String ComplainterName;

    private static final long serialVersionUID = 1L;

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId == null ? null : complaintId.trim();
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Date getComplaintDate() {
        return complaintDate;
    }

    public void setComplaintDate(Date complaintDate) {
        this.complaintDate = complaintDate;
    }

    public String getComplaintComment() {
        return complaintComment;
    }

    public void setComplaintComment(String complaintComment) {
        this.complaintComment = complaintComment == null ? null : complaintComment.trim();
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
    }
}