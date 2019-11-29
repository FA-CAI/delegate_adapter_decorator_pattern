package com.shangxue.adapter_pattern.poweradapter;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-06 23:04
 **/
public class AC220 {
    public int outputAC220V(){
        int output = 220;
        System.out.println("输出电流" + output + "V");
        return output;
    }
}
