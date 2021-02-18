package com.self.example.beanvalidation.common.po;

import lombok.Data;

import java.util.Date;

public class BasePO {
    private Date createdTime;
    private Date modifyTime;

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
