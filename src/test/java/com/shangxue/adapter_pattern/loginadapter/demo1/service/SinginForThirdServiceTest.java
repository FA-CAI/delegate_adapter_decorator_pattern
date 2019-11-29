package com.shangxue.adapter_pattern.loginadapter.demo1.service;

public class SinginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("tom","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
}