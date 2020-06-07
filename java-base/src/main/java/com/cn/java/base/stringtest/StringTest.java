package com.cn.java.base.stringtest;

public class StringTest {
	
	  public static void main(String[] args) {
		  
		
		  /**
		   *   1 equals()  只判断引用类型
		   *   2 父类Object的equlas()方法 就是 ==判断  引用类型判断的是地址
		   *   3 String重写了父类的equals()方法 是把字符串转换成两个char数组 遍历一个字符一个字符的判断是否相等
			*   public boolean equals(Object anObject) {
			        if (this == anObject) {
			            return true;
			        }
		        if (anObject instanceof String) {
		            String anotherString = (String)anObject;
		            int n = value.length;
		            if (n == anotherString.value.length) {
		                char v1[] = value;
		                char v2[] = anotherString.value;
		                int i = 0;
		                while (n-- != 0) {
		                    if (v1[i] != v2[i])
		                        return false;
		                    i++;
		                }
		                return true;
		            }
		        }
		        return false;
		    }
		   */
		  String name1 = "tom";
		  String name2 = "tom";
		  
		  /**
		   * 4   自定义的引用类型  如果没有 重写了Object的equalas() 也是==判断  永远都false
		   * 一般的情况 我们认为实体对象如果所有的属性都相同就是一个对象 即应该是true
		   * 我们都需要在pojo实体对象中重写equals()方法 同时还得重写hashCode()
		   */
		  System.out.println(name1.equals(name2));
		  
		  User user1 = new User(100, "张三", 20);
		  User user2 = new User(100, "张三", 20);
		  
		  System.out.println(user1.equals(user2)); //false  重写了equals之后 true
	
		  
		  /**
		   * equlas()方法 就是 ==判断  引用类型判断的是地址
		   * public boolean equals(Object obj) {
              return (this == obj);
            }
		   */
		   Object obj = new Object();
		   
	  
	  }

}
