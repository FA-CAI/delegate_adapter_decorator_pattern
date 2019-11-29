package com.shangxue.decorator_pattern.battercake;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-07 15:28
 **/
public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
