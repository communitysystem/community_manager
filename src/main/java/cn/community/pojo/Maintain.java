package cn.community.pojo;

import java.io.Serializable;

public class Maintain implements Serializable {
    private String maintainId;

    private Integer ownerId;

    private Integer staffId;

    private Double maintainCharge;

    private String picture;

    private String maintainInfo;

    private String feedback;

    private static final long serialVersionUID = 1L;

    public String getMaintainId() {
        return maintainId;
    }

    public void setMaintainId(String maintainId) {
        this.maintainId = maintainId == null ? null : maintainId.trim();
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Double getMaintainCharge() {
        return maintainCharge;
    }

    public void setMaintainCharge(Double maintainCharge) {
        this.maintainCharge = maintainCharge;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getMaintainInfo() {
        return maintainInfo;
    }

    public void setMaintainInfo(String maintainInfo) {
        this.maintainInfo = maintainInfo == null ? null : maintainInfo.trim();
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
    }
}