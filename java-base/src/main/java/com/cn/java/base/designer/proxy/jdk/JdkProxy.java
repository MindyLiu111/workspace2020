package com.cn.java.base.designer.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 * Created by mindy on 2020/2/13.
 */
public class JdkProxy  implements InvocationHandler{

    //1 设置要代理的对象属性
    private  UserDao userDao;

    // 2 获取被代理对象
    public JdkProxy(UserDao userDao){

        this.userDao = userDao;
    }


    //3 创建代理对象
    //3 产生UserDao的代理
    public  UserDao  createProxy(){
        /**
         *  代理对象的类加载器
         *  代理对象的接口
         *  InvocationHandler 接口实现类，一般我们不用创建该类的对象
         *  而是用当前类来实现InvovationHandler接口来实现以上目的
         */
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(
                userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                this);
        return  userDaoProxy;
    }


    /**
     * 增强方法
     * @param proxy  代理对象
     * @param method  代理方法
     * @param args  方法的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if("save".equalsIgnoreCase(method.getName())){
             //实现增强
            System.out.println("权限校验......");
            System.out.println("日志输出......");
            System.out.println("try...catch异常处理........");

            //调用目标方法
            return method.invoke(userDao,args);
        }
        //2 如果不需要增强则放行,执行目标方法
        return method.invoke(userDao,args);
    }


}
