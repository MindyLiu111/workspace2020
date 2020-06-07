package com.cn.java.base.test01;

public class Student {
	
	
	private Integer age;
	
	private String name;
	

	public Student() {
		
		init();
		  
	}
	
	
     private void init() {
    	 
    	 int num = 100;
    	 
    	 
	    System.out.println("��ʼ����ɫ����........");
	    
	    System.out.println("��ʼ���Ա�.........");
	    
	    System.out.println("��ʼ��װ��..........");
	    
	    System.out.println("��ʼ������..........");
	    
	    System.out.println("��ʼ������.........");
	    
	    
	}


	public void Student() {
		
		  System.out.println("Student.............");
	 }
     
     

	public Student(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void showMoney(double money){
		
		System.out.println(money);
		
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	
	
	 //��������������������ֵһ��,�����������һ��
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
