package com.cn.java.base.jdk8.demo02;

import com.cn.java.base.pojo.UserBean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;



/**
 * jdk8新特性--Stream 流式思想
 * @author Administrator
 *
 */
public class Test02 {
	
	
	/**
	 * 集合遍历--stram
	 */
	public static void test01() {
		
		 List<String> list = new ArrayList();
		 
//		 list.add("aa");
//		 list.add("ee");
//		 list.add("dd");
//		 list.add("ff");
		 
		 //给集合初始化值
		 Collections.addAll(list, "aa","ee","dd","ff");
		 
		 //遍历集合
		 list.stream().forEach(System.out::println);
		 
	}
	

	/**
	 * 集合遍历--排序
	 */
	 public static void test02() {
		
		 List<String> list = new ArrayList();
		 
		 //给集合初始化值
		 //Collections.addAll(list, 88,11,99,66);
		 Collections.addAll(list, "aa","ee","dd","ff");
		 
		 //遍历集合    sorted 传递了一个Comparator接口
		 
		 list.stream().sorted(String::compareTo).forEach(System.out::println);
		 
	}
	 
	 
		/**
		 * 集合遍历--截取
		 */
		 public static void test03() {
			
			 List<Integer> list = new ArrayList();
			 
			 //给集合初始化值
			 Collections.addAll(list, 88,11,99,66);
			
			 //list.subList(0, 3)
			 
			 //遍历集合   截取
			 list.stream().limit(3).forEach(System.out::println);
			  
		}
		 
		 
		/**
		 * 获取集合中的最大值  UserBean
		 */
		 public static void test04(List<UserBean> list) {
			
			 OptionalInt result=  list.stream().mapToInt(UserBean::getAge).max();
			 
			 System.out.println(result.getAsInt());
			 
		}
		 
		 
		 /**
		 * 获取集合中的最小值  UserBean
		 */
		 public static void test05(List<UserBean> list) {
			
			 OptionalInt result=  list.stream().mapToInt(UserBean::getAge).min();
			 
			 System.out.println(result.getAsInt());
			 
		}
			 
			 
			 		 
	
	   public static void main(String[] args) {
		 
		   //Test02.test02();
		 
		   //Test02.test03();
		   
		   //集合 初始化值
		   List<UserBean> list 
		      = Stream.of(new UserBean(1, "marry", 21),
	                new UserBean(2, "tom", 11),
	                new UserBean(4, "jhon", 12),
	                new UserBean(5, "lily", 33),
	                new UserBean(6, "mike", 44),
	                new UserBean(7, "jerry", 66)).collect(Collectors.toList());
		   
		   //Test02.test04(list);
		   
		   Test02.test05(list);
		   
		 
	   }
	   
	   

}
