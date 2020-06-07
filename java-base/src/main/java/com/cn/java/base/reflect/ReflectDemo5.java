package com.cn.java.base.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * 通过构造函数创建对象实例
 */
public class ReflectDemo5 {

	public static void main(String[] args) throws Exception {

		// 1 获取字节码文件对象
		Class c = Class.forName("com.reflect.demo.User");

		// 2 返回值是Object接收,第一个参数表示对象是谁，第二参数表示调用该方法的实际参数
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();

		//3 设置属性值
        Field nameFied = c.getDeclaredField("name");
		nameFied.setAccessible(true);
		nameFied.set(obj,"张三");

		// 4 第一个参数表示的方法名，第二个参数表示的是方法的参数的class类型
		System.out.println("----------------------调用无参方法----------------------");
		Method m1 = c.getMethod("showName");
		m1.invoke(obj); // 调用obj对象的m1方法

		System.out.println("----------------------调用有参Sioux方法----------------------");

		Method m2 = c.getDeclaredMethod("buyBook",Double.class);
		m2.setAccessible(true);
		m2.invoke(obj,100.0); // 调用obj对象的m1方法

	}

}