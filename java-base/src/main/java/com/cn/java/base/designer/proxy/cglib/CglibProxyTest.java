package com.cn.java.base.designer.proxy.cglib;

/**
 * Created by mindy on 2020/2/13.
 */
public class CglibProxyTest {

    public static void main(String[] args) {

        CustomerDao customerDaoProxy =  new CglibProxy(new CustomerDao()).createProxy();
        customerDaoProxy.save();
        customerDaoProxy.update();
    }
}
