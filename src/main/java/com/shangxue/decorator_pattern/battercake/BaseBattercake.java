package com.shangxue.decorator_pattern.battercake;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-07 15:22
 **/
public class BaseBattercake extends Battercake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
