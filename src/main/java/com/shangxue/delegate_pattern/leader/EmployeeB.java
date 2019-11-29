package com.shangxue.delegate_pattern.leader;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-03 21:25
 **/
public class EmployeeB implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("本码畜擅长架构，开干！do framework");
    }
}
