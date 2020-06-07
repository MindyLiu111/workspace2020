package com.cn.java.base.jihe;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	  public static void main(String[] args) {
		  		  
		  Set<Object> set = new TreeSet<Object>();
		  
			 set.add(1);
			 set.add(2);
			 set.add(2);
		  System.out.println(set);
		  
		
		
		  Set<Student> set2 = new TreeSet<Student>();
		  
		 
		  set2.add(new Student("张三",22));
		  set2.add(new Student("李四",21));
		  
		  System.out.println(set2);
		  
		  
		  
		  Set<Teacher> set3 = new TreeSet<Teacher>(new Comparator<Teacher>() {

				@Override
				public int compare(Teacher t1, Teacher t2) {
					
					if(t1.age > t2.age && t1.name.hashCode() > t2.name.hashCode()){
						
						return 1;
						
					}else if(t1.age < t2.age || t1.name.hashCode() < t2.name.hashCode()){
						
						return -1;
					}
					
					return 0;
				}
			  
		});
		  
		  
		  set3.add(new Teacher("����",22));
		  set3.add(new Teacher("��˹",21));
		  
		  
		  
		
	}
	  
	  
}
