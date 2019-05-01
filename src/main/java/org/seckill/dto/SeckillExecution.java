package org.seckill.dto;

import org.seckill.entity.SuccessKilled;
import org.seckill.enums.SeckillStateEnum;

/**
 * 封杀秒杀执行后的结果
 */
public class SeckillExecution {

    private long seckillId;
    private int state;
    private String stateInfo;
    private SuccessKilled successKilled;
    //成功返回的参数的构造方法
    public SeckillExecution(long seckillId, SeckillStateEnum seckillstateEnum, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.state = seckillstateEnum.getState();
        this.stateInfo = seckillstateEnum.getStateInfo();
        this.successKilled = successKilled;
    }
    //失败返回的构造方法

    public SeckillExecution(long seckillId, SeckillStateEnum seckillstateEnum) {
        this.seckillId = seckillId;
        this.state = seckillstateEnum.getState();
        this.stateInfo = seckillstateEnum.getStateInfo();
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }

    @Override
    public String toString() {
        return "SeckillExecution{" +
                "seckillId=" + seckillId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", successKilled=" + successKilled +
                '}';
    }
}
