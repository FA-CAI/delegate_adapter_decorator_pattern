package com.shangxue.adapter_pattern.loginadapter.demo2.adapters;

import com.shangxue.adapter_pattern.loginadapter.ResultMsg;

/**
 * Created by Tom on 2019/3/16.
 */
public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
