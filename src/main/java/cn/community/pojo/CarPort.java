package cn.community.pojo;

import java.io.Serializable;
import java.util.Date;

public class CarPort implements Serializable {
    private String portId;

    private Integer ownerId;

    private String portStat;

    private Date startDate;

    private Date endDate;
    //自己添加的属性
    private String carPortOwnerName;           //车位主人
    private String carNum;                     //车牌号

    public String getCarPortOwnerName() {
        return carPortOwnerName;
    }

    public void setCarPortOwnerName(String carPortOwnerName) {
        this.carPortOwnerName = carPortOwnerName;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    private static final long serialVersionUID = 1L;

    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId == null ? null : portId.trim();
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getPortStat() {
        return portStat;
    }

    public void setPortStat(String portStat) {
        this.portStat = portStat == null ? null : portStat.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}