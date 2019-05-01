package org.seckill.entity;

import java.util.Date;

public class SuccessKilled {
    //秒杀的商品的ID

    private long seckillId;

//秒杀用户的电话

    private long userPhone;

//秒杀商品的状态

    private short state;

//秒杀成功的时间

    private Date creteTime;

// 多对一的复合属性

    private Seckill seckill;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    public SuccessKilled() {
    }

    public SuccessKilled(long seckillId, long userPhone, short state, Date creteTime, Seckill seckill) {
        this.seckillId = seckillId;
        this.userPhone = userPhone;
        this.state = state;
        this.creteTime = creteTime;
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", creteTime=" + creteTime +
                ", seckill=" + seckill +
                '}';
    }
}
