package cn.community.pojo;

import java.io.Serializable;
import java.util.Date;

public class Arrearage implements Serializable {
    private String arrearageId = "无欠费信息";

    private Integer ownerId;

    private Double arrearageSum = 0.0;

    private Date arrearageDate;

    private static final long serialVersionUID = 1L;

    public String getArrearageId() {
        return arrearageId;
    }

    public void setArrearageId(String arrearageId) {
        this.arrearageId = arrearageId == null ? null : arrearageId.trim();
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Double getArrearageSum() {
        return arrearageSum;
    }

    public void setArrearageSum(Double arrearageSum) {
        this.arrearageSum = arrearageSum;
    }

    public Date getArrearageDate() {
        return arrearageDate;
    }

    public void setArrearageDate(Date arrearageDate) {
        this.arrearageDate = arrearageDate;
    }
}