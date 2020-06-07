package com.cn.java.base.jdk8.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * lambada表达式 遍历集合
 * @author Administrator
 *
 */
public class Test01 {
	
    public static void main(String[] args) {
    	
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	
    	// 直接打印
    	list.forEach(System.out::println);
	}
}
