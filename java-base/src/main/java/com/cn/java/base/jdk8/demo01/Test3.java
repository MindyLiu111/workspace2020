package com.cn.java.base.jdk8.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cn.java.base.pojo.UserBean;

/**
 * Stream 流式思想
 * @author Administrator
 *
 */
public class Test3 {
	
	
    public 	List<UserBean> list;
	static{
		
	}
	
	/**
	 * 普通流遍历集合
	 */
	 public  static void method01() {
		 
	    List<String> list = new ArrayList<>();
	    
	    //给集合添加值 代码简洁
        Collections.addAll(list, "aa", "bb", "cc", "dd", "mm", "tt");
                
        list.stream().forEach(System.out::println); //打印的简化写法
        
	 }
	 
	 
     /**
	  * 集合--排序
	  * 
	  */
	  public  static void method02() {
		 
	    List<Integer> list = new ArrayList<>();
	    
	    //给集合添加值 代码简洁
        Collections.addAll(list, 11, 44, 1, 9, 23, 66);
        
        
        //sorted()排序操作  Comparator<? super T> comparator 传递一个Comparator接口
        list.stream().sorted(Integer::compareTo).forEach(System.out::println);
                        
	  }
	  
	  
	  /**
	   * 集合--截断操作
	   * 
	   */
	  public  static void method03() {
		 
	    List<Integer> list = new ArrayList<>();
	    
	    //给集合添加值 代码简洁
        Collections.addAll(list, 11, 44, 1, 9, 23, 66);
        
        
        list.stream().limit(3).forEach(System.out::println);
       
                        
	  }
	  
	  
	  
	  /**
	   * 集合--求最大值
	   * 
	   */
	  public  static void method04(List<UserBean> list) {
		 
		 
			 OptionalInt optional = list.stream().mapToInt(UserBean::getId).max();
			 
	         System.out.println("max=" + optional.getAsInt());

                        
	  }
	  
	  /**
	   * 集合--最小值
	   * @param list
	   */
	  public static void method05(List<UserBean> list){
		  
	        OptionalInt optional = list.stream().mapToInt(UserBean::getId).min();
	        
	        System.out.println("min=" + optional.getAsInt());
	  }
	 
	  
	  
     public static void main(String[] args) {
    	
    	 //Test3.method01();
    	 
    	 //Test3.method02();
    	 
    	// Test3.method03();
    	 
    	 
		  List<UserBean> list = Stream.of(
				    new UserBean(1, "AKB001", 20),
	                new UserBean(2, "AKB002", 20),
	                new UserBean(4, "AKB004", 20),
	                new UserBean(5, "AKB005", 20),
	                new UserBean(6, "AKB006", 20),
	                new UserBean(6, "AKB006", 20),
	                new UserBean(7, "AKB007", 20),
	                new UserBean(3, "AKB003", 20)).collect(Collectors.toList());
		  
		  // Test3.method04(list);
		  
		  
		Test3.method05(list);
		  
		  
	 }
     
     
     
}
