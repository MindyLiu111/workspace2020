package com.cn.java.base.designer.proxy.jdk;

/**
 * Created by mindy on 2020/2/13.
 */
public class JdkProxyTest {

    public static void main(String[] args) {

//           UserDao userDao  = new UserDaoImpl();
//           System.out.println("自己在代码中写权限校验。。。。。");
//           System.out.println("自己在代码中写日志。。。。。");
//           userDao.save();

            UserDao userDao = new UserDaoImpl();  // 创建被代理对象
            UserDao userDaoProxy = new JdkProxy(userDao).createProxy();  // 创建了代理
            userDaoProxy.save();
            userDaoProxy.delete();

    }
}
