package com.cn.java.base.jdk8.demo02;

/**
 * jdk8新特性--接口的默方法和静态方法是可以有方法体的
 * StringBoot 的底层源码中大量使用
 * @author Administrator
 *
 */
public interface Test3 {
	
	
	public void test01() ;
	   
	public default void test02() {
		
		System.out.println("default 默认方法.......");
	} 
	
	
    public static void test03() {
		
		System.out.println("static 静态方法.......");
	} 
    
    
	
}
