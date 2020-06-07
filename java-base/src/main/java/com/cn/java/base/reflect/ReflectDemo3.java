package com.cn.java.base.reflect;



import java.lang.reflect.Constructor;

/*
 * 通过构造函数创建对象实例
 */
public class ReflectDemo3 {

	public static void main(String[] args) throws Exception {

		// 1 获取字节码文件对象
		Class c = Class.forName("com.reflect.demo.User");

		// 2 获取单个构造方法
		Constructor con1 = c.getConstructor();// 返回的是public无参构造方法对象
		System.out.println(con1);

		/**
		 * 3 public T newInstance(Object... initargs)
		 *
		 * 使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
		 */
		System.out.println("--------------同构造函数创建对象------------------------------");
		Object obj = con1.newInstance();
		System.out.println(obj);

		User user = (User)obj;
		System.out.println("获取方法: " + user.showInfo());
		user.setName("张三");
		System.out.println("获取属性 :" + user.getName());

	}


}