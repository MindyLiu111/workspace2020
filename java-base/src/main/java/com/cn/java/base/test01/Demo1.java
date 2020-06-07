package com.cn.java.base.test01;


/**
 * equals����д   false Դ������ж�
      Object.class
     public boolean equals(Object obj) {
        return (this == obj);
    }
 * @author Mindy
 *
 */
public class Demo1 {
	
	  public static void main(String[] args) {
		
		  Student dtu01 = new Student(new Integer(20), "����");
		  Student dtu02 = new Student(new Integer(20), "����");
		  
		  System.out.println(dtu01.equals(dtu02)); 
		  
		  //������������ж���ͬһ������,��Ӧ������hashCodeֵҲһ��
		  
		  System.out.println(dtu01.hashCode());
		  System.out.println(dtu02.hashCode());
		  
		  //��������������������ֵһ��,�����������һ��
		 
		  String str01 = "hello";
		  String str02 = "hello";
		  
		  /**
		   *  public boolean equals(Object anObject) {
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
		  System.out.println(str01.equals(str02));  
		  
		  double money = 100000D;
		  dtu01.showMoney(money);
		  
		  
		  dtu01.Student();
		  
		
	}
	  
	  
	  

}
