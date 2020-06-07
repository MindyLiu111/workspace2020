package com.cn.java.base.reflect;



import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * 通过构造函数创建对象实例--操作成员变量-属性
 */
public class ReflectDemo4 {

	public static void main(String[] args) throws Exception {

		// 获取字节码文件对象
		Class c = Class.forName("com.reflect.demo.User");

		// 获取单个构造方法
		Constructor con1 = c.getConstructor();// 返回的是构造方法对象

		// 获取所有的成员变量
		System.out.println("----------------------获取所有的public成员变量--------------------------");
		 Field[] fields = c.getFields();
		 for (Field field : fields) {
		     System.out.println(field);
		 }

		System.out.println("----------------------获取所有的public和private成员变量--------------------------");

		Field[] fields1 = c.getDeclaredFields();
		for (Field field : fields1) {
			System.out.println(field);
		}



		/**
		 * public T newInstance(Object... initargs)
		 * 使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
		 */
		System.out.println("--------------同构造函数创建对象------------------------------");
		Object obj = con1.newInstance();
		System.out.println(obj);


		System.out.println("----------------------获取单个的成员变量--------------------------");
		Field ageField = c.getField("age");
		System.out.println("1....age = "+ageField.getName());

		ageField.set(obj, 100); // 给obj对象的addressField字段设置值为"北京"
		System.out.println("2....age = "+ageField.getName());

		User user = (User)obj;
		System.out.println("age = "+user.getAge());



		System.out.println("----------------------获取privae 成员变量--------------------------");
		Field nameField = c.getDeclaredField("name");
		System.out.println("3....name = "+nameField.getName());

		nameField.setAccessible(true);
		nameField.set(obj, "林青霞");

		user = (User)obj;
		System.out.println("name = " + user.getName());


	}

}