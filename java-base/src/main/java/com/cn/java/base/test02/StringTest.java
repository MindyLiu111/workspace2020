package com.cn.java.base.test02;

import java.util.ArrayList;
import java.util.List;


public class StringTest {

	 public static void main(String[] args) {
		 
		 String s1 = "abc";  
		 
		 String s2 = "abc";  
		 
		 System.out.println("s1 == s2 : "+(s1==s2));  //true
		 System.out.println("s1.equals(s2) : " + (s1.equals(s2)));  //true  
		 
		 /**
		  * 
		  * equals()����Դ��
		  * public boolean equals(Object anObject) {
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
		 
		 
		 String s3 = new String("abc"); 
		 System.out.println("s1 == s3 : "+(s1==s3));  
		 
		 String s4 = new String("abc");   
		 
		 System.out.println("s3 == s4 : "+(s3==s4));//false
		 
		 System.out.println("s3.equals(s4):"+(s3.equals(s4)));//true
		 
		 
		 String str1 = "ab" + "cd";  //1������  
	     String str11 = "abcd";   
	     System.out.println("str1 = str11 : "+ (str1 == str11));  

		 
	     String str2 = "ab";  //1������  
         String str3 = "cd";  //1������         
         
         
         /**
          * 1 ����һ��StringBuffer����
          * 2 StringBuffer�����д���str2��ֵ
          * 3 ����append()����ʵ��str2��str3�ַ��ĺϲ�
          * 4 �ڶ��п����ڴ�ռ���� �ϲ�����ַ���
          * 5 ��str4��ջ�ڴ���� �Ե�ַ
          */
         String str4 = str2+str3;                                        
         String str5 = "abcd";    
         System.out.println("str4 = str5 : " + (str4==str5)); // false 
         
         System.out.println("str4 = str5 : " + (str4.equals(str5))); // true 
         
         
         /**
          * 1 ���ٳ�����  �ռ�  ����  hello   0x001
          * 2 ����ԭ���ĳ����ؿռ�  ���¿����µĿռ����  world    0x002
          * 3 ��ջ����д����µĳ����ؿռ��ַ  x002
          */
         String finalStr = "hello";
         finalStr = "world";
         
       
         
         
         String[] strs = new String[10];
         List list = new ArrayList();
         
         System.out.println(finalStr.length());
         
         
         System.out.println(strs.length);
         
         System.out.println(list.size());
         
         /**
          * ��μ���һ���ַ���ĳ���ַ��ĳ��ִ���
          */

         String strstr = "hellworldhelloworld";
         
        String[] strArrays =  strstr.split("");
       
        int count = 0;
        
        for (String string : strArrays) {
			if(string.equals("l")){
				count ++;
			}
		}
        
        System.out.println(count);
        
        
         /**
	   	  * Դ�룺  value = new char[capacity];capacity=16
	   	  */
	   	 StringBuffer buffer1 = new StringBuffer();
	   	 
	   	 buffer1.append("ll");
   	 	
   	 
   	 
	   	 //long value = 10;  
	   	 //double value = 10;
	   	String value = "����һ";
	   	 switch (value) {
			case "����һ":
				  System.out.println("����");
				break;
	
			default:
				break;
		}
   	 
         
	}
	 
	 
	
	 
	 
	 
}
