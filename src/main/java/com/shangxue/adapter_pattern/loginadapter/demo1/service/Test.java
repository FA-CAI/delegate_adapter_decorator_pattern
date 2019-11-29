package com.shangxue.adapter_pattern.loginadapter.demo1.service;

/**
 * @Descirption shangxue
 * @Author tengfei
 * @Date 2019/11/28 18:16
 * @Version
 */
public class Test {
    public static void main(String[] args) {

        SinginForThirdService service=new SinginForThirdService();

        //还可以加一层策略模式（或者SinginForThirdService里加成委派模式）

        service.loginForQQ("qqqqqqqqqqq");


    }

}
