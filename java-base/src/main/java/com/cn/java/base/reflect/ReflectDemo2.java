package com.cn.java.base.reflect;

import java.lang.reflect.Constructor;


/*
 * 通过反射获取构造方法并使用。
 */
public class ReflectDemo2 {

	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("com.reflect.demo.User");

		// 获取构造方法
//		 public Constructor[] getConstructors():所有公共构造方法
//		 public Constructor[] getDeclaredConstructors():所有构造方法

		System.out.println("------------------所有公共构造方法-----------------------------");
		 Constructor[] cons1 = c.getConstructors();
		 for (Constructor con : cons1) {
		     System.out.println(con);
		 }

		System.out.println("------------------所有构造方法-----------------------------");

		Constructor[] cons2 = c.getDeclaredConstructors();
		for (Constructor con : cons2) {
			System.out.println(con);
		}

		System.out.println("---------------------获取无参构造方法--------------------------");
		// 获取单个构造方法
		Constructor con3 = c.getConstructor();// 返回的是构造方法对象
		System.out.println(con3);

		System.out.println("---------------------获取带参构造方法--------------------------");

		/**
		 * public Constructor<T> getConstructor(Class<?>... parameterTypes)
		 *
		 * User(String name, Integer age)
		 *
		 * 参数表示的是：你要获取的构造方法的构造参数个数及数据类型的class字节码文件对象
		 */
		Constructor con4 = c.getConstructor(Integer.class,String.class,Integer.class);// 返回的是构造方法对象
		System.out.println(con4);

		System.out.println("---------------------获取所有的带参构造方法--------------------------");

		Constructor con5 = 	c.getDeclaredConstructor(String.class, Integer.class);
		System.out.println(con5);

	}


}