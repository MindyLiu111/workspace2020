package com.cn.java.base.jdk8.demo01;

/**
 * 接口 有静态方法和默认方法可以实现方法体
 * @author Administrator
 *
 */
public interface Test2 {

	 default void method1() {
		  System.out.println("默认方法.....");
		  
	 }   
	
	 
	  static void  method2() {
		  
		  System.out.println("静态方法........");
		  
	 }
	 
	 
     public static void main(String[] args) {
    	


	 }
     
     
     
}
