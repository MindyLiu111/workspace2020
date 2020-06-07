package com.cn.java.base.test02;

public class TestFinal {

	  public void test01(final int num){
		  
		  //num = 10;
	  }
	  
      public static void test02(final Student student){
    	  
    	  System.out.println(student);
		  
    	 // student = new Student();//��student������ֹ�Ķ����ַ�ı���
    	  
    	  student.name="����";
    	  student.age=30;
    	  
    	  System.out.println(student);
	  }
      
      
      public static void main(String[] args) {
    	  
    	  Student student = new Student();
    	  student.name="����";
    	  student.age = 20;
    	  System.out.println(student);
    	  
    	  TestFinal.test02(student);
    	  
    	  
    	  
	}
	  
	  
}

class Student{
	
	 String name;
	 int age;
	 
}
