package com.cn.java.base.designer.singleton.lanhan;

/**
 * 懒汉单例设计模式
 * Created by mindy on 2020/2/13.
 */
public class Singleton {

    // 1 将自身实例化对象设置为一个属性，并用static修饰
    private static Singleton instance;

    //2  构造方法私有化
    private Singleton() {

    }

    //3  静态方法返回该实例，加synchronized关键字实现同步
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
