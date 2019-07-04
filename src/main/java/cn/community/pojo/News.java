package cn.community.pojo;

import java.io.Serializable;
import java.util.Date;

public class News implements Serializable {
    private String newsId;

    private Date newsDate;

    private Integer managerId;

    private String title;

    private String picture;

    private String newCommnet;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "News{" +
                "newsId='" + newsId + '\'' +
                ", newsDate=" + newsDate +
                ", managerId=" + managerId +
                ", title='" + title + '\'' +
                ", picture='" + picture + '\'' +
                ", newCommnet='" + newCommnet + '\'' +
                '}';
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId == null ? null : newsId.trim();
    }

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getNewCommnet() {
        return newCommnet;
    }

    public void setNewCommnet(String newCommnet) {
        this.newCommnet = newCommnet == null ? null : newCommnet.trim();
    }
}