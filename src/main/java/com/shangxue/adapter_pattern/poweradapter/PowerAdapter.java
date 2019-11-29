package com.shangxue.adapter_pattern.poweradapter;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-06 23:06
 **/
public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outoupDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC:" + adapterInput + "V,输出DC：" + adapterOutput + "V");
        return adapterOutput;
    }
}
