package com.shangxue.delegate_pattern.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 相当于“项目经理”的角色，使得BOSS只跟项目经理打交道，不必管j2ee的——
 * <servlet>
 *      <servlet-name>aaa</servlet-name>
 *     <servlet-class>com.shangxue.XxxServlet</servlet-class>
 * </servlet>
 *  <servles-pattern>
 *      <servlet-name>aaa</servlet-name>
 *      <servlet-url>/service/do.xx</servlet-url>
 *  </servles-pattern>
 *
 *  解放双手，不用写一个servlet配一次，只要一个DispatcherServlet，其他交给他管理（“多份变一份，有点缓冲的味道，短期看，简单变复杂，长远看，复杂变简单！”“统一管理”）
 **/
public class DispatcherServlet extends HttpServlet {

    List<Handle> handlerMapping =new ArrayList<Handle>();

    @Override
    public void init() throws ServletException {
        Class<?> memberController=MemberController.class;
        try {
            handlerMapping.add(new Handle().setController(memberController.newInstance()).setMethod(memberController.getMethod("getMemberById", String.class)).setUri("getMemberById.do"));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatcher(req,resp);
        
    }

    private void doDispatcher(HttpServletRequest req, HttpServletResponse resp) {
        //1.获取用户请求的url
            // 如果按照J2EE的标准，每个url对应一个Servlet，url由浏览器输入


        String uri=req.getRequestURI();
        Handle handle=null;

        //2.Servlet拿到yrl以后，要做权衡（要做判断，要做选择）
            //根据用户请求的url，去找到这个url对应的某一个java类的方法(策略模式，通常是固定的一个业务逻辑或算法。我们需要个容器handlerMapping（把“关系”保存在这里，类似于常量的东西）)
            //通过拿到的url去handleMapping（我们把它认为是策略常量）


        for(Handle h:handlerMapping){
            if(uri.equals(h.getUri())){
                handle=h;  //
                break;
            }
        }

        //3.将具体的任务奋发给Method(通过反射区调用其对应的方法)


        try {
           Object obj = handle.getMethod().invoke(handle.getController(),req.getParameter("mid"));
            //4.获取到Method执行的结果，通过Response返回出去
                 //通过response写出去
           resp.getWriter().write(obj.toString());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    class Handle{
        private Object controller;
        private Method method;
        private String uri;

        public Object getController() {
            return controller;
        }

        public Handle setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handle setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUri() {
            return uri;
        }

        public Handle setUri(String uri) {
            this.uri = uri;
            return this;
        }
    }
}
