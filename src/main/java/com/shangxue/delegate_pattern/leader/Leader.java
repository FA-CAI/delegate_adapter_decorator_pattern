package com.shangxue.delegate_pattern.leader;

import java.util.HashMap;
import java.util.Map;

/**
 * 码畜头头--经理
 **/
public class Leader implements IEmployee{
    private Map<String,IEmployee> targets = new HashMap<String,IEmployee>();
    public Leader() {
        targets.put("加密",new EmployeeA()); //初始化时把策略对应关系安排好
        targets.put("架构",new EmployeeB());
    }

    @Override
    public void doing(String command) {

        targets.get(command).doing(command); //第二个command目前看来好像没什么意义嘛，因为对应关系已被Map处理好
    }
}
