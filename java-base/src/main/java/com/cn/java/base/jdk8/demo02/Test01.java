package com.cn.java.base.jdk8.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * jdk8新特性--lambada表达式
 * 集合--遍历
 * 打印语法简化
 * @author Administrator
 *
 */
public class Test01 {
	
	 public static void main(String[] args) {
		 
		 List list = new ArrayList();
		 list.add(100);
		 list.add(111);
		 list.add(233);
		  
		 // 遍历并打印
//		 for (Object object : list) {
//		  System.out.println(object);
//		 }
		 
		 // 遍历集合 并打印
		 list.forEach(System.out::println);
		 
	}

}
