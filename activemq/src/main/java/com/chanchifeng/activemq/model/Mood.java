package com.chanchifeng.activemq.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author:porschan
 * @description:
 * @date: Created in 13:13 2019/3/4
 * @modified By:
 */

@Entity
@Table(name = "mood")
public class Mood implements Serializable {

    /**
     * 主键
     */
    @Id
    private String id;
    /**
     * 说说内容
     */
    private String content;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 点赞数量
     */
    private Integer praiseNum;
    /**
     * 发表时间
     */
    private Date publishTime;

    @Override
    public String toString() {
        return "AyMood{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", userId='" + userId + '\'' +
                ", praiseNum=" + praiseNum +
                ", publishTime=" + publishTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getPraiseNum() {
        return praiseNum;
    }

    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
}
