package com.cn.java.base.designer.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by mindy on 2020/2/13.
 */
public class CglibProxy implements MethodInterceptor {

    //1 定义代理对象 target
    private CustomerDao customerDao;

    //2 获取被代理对象
    public  CglibProxy(CustomerDao customerDao){
        this.customerDao = customerDao;
    }

    //3 创建代理对象
    //3 产生CustomerDao的代理
    public CustomerDao createProxy() {

            //1 创建Cglib的核心类 Enhancer对象
            Enhancer enhancer = new Enhancer();

            //2 设置父类
           enhancer.setSuperclass(customerDao.getClass());

            //3 设置回调  类似于 InvocationHandler对象的作用
            enhancer.setCallback(this);// 类似jdkProxy我们去实现一个Method

            //4 创建代理对象
            CustomerDao proxy = (CustomerDao)enhancer.create();

            return  proxy;
    }


    /**
     * 增强方法
     * @param proxy
     * @param method
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        //1 目前只对save方法增强
        if("save".equalsIgnoreCase(method.getName())){

            //实现增强
            //1 实现增强代码逻辑,权限校验
            System.out.println("执行权限校验..............");
            return methodProxy.invokeSuper(proxy,args);
        }

        return methodProxy.invokeSuper(proxy,args);
    }


}
