package com.shangxue.decorator_pattern.battercake;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-07 15:23
 **/
public abstract class BattercakeDecorator extends Battercake{
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected String getMsg() {
        return this.battercake.getMsg();
    }

    public int getPrice() {
        return this.battercake.getPrice();
    }
}
