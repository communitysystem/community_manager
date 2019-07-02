package cn.community.pojo;

import java.io.Serializable;

public class CarPort implements Serializable {
    private String portId = "暂无车位";

    private Integer ownerId;

    private String portStat = "无";

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
}