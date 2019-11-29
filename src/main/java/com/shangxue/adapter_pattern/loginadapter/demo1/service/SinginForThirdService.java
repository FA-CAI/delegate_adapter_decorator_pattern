package com.shangxue.adapter_pattern.loginadapter.demo1.service;

import com.shangxue.adapter_pattern.loginadapter.ResultMsg;

/**
 * 继承。非常稳定的方法就不去动了，直接继承下来 （不动“非常稳定的方法”的源代码，对修改关闭，多扩展开放）
 * 或者通过注入SiginService，也行，反正老的SiginService一般还会被打上"过期"的注释，这点和装饰器模式不同
 */
public class SinginForThirdService extends SiginService {

    public ResultMsg loginForQQ(String openId){
        //1、openId是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为QQ_EMPTY
        //3、注册（在原有系统里面创建一个用户）
        //4、调用原来的登录方法。于是就"兼容"了

        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String token){
        //通过token拿到用户信息，然后再重新登陆了一次
        return  null;
    }

    public ResultMsg loginForTelphone(String telphone,String code){

        return null;
    }

    private ResultMsg loginForRegist(String username,String password){

        super.regist(username,null);

        return super.login(username,null);

    }
}
