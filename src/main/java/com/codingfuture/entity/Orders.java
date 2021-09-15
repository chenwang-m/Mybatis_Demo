package com.codingfuture.entity;

import java.util.Date;
import java.util.List;

public class Orders {
    private int id;
    private Date creatTime;
    private int userId;
    private List<OrderDetail> orderDetailList;
    //private User user;


    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", userId=" + userId +
                ", orderDetailList=" + orderDetailList +
                '}';
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
