package com.shangxue.adapter_pattern.loginadapter.demo2;


public class PassportForThirdAdapterTest {
    public static void main(String[] args) {

        IPassportForThird passportForThird = new PassportForThirdAdapter();

        passportForThird.loginForQQ("");

    }
}