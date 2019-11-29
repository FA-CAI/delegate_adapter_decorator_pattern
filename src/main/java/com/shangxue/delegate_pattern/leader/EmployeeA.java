package com.shangxue.delegate_pattern.leader;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-03 21:25
 **/
public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("本码畜擅长加密，开干！do  encrypt ");
    }
}
