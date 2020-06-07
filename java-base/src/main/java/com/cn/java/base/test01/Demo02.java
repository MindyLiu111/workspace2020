package com.cn.java.base.test01;

public class Demo02 {


	
    public static void calSalary1(double salary,double bonus){
    	
	    	salary+=1000;
	    	bonus +=100;
    }
    
    
    public static void calSalary2(Employee employee ){
    	
    	employee.salary+=1000;
    	employee.bonus +=100;
    	
	}

	   public static void main(String[] args){
	       
		     Employee employee1 = new Employee();
		     employee1.salary = 1000;
		     employee1.bonus = 100;
		     Demo02.calSalary1(employee1.salary ,  employee1.bonus );
		     
		     
		     System.out.println("employee1.salary : " + employee1.salary  +"        employee1.bonus ��"+employee1.bonus);
		     
		     
		     Employee employee2 = new Employee();
		     employee2.salary = 1000;
		     employee2.bonus = 100;
		     
		     Demo02.calSalary2(employee2);
		    
			 System.out.println("employee2.salary : " + employee2.salary  +"        employee2.bonus ��"+employee2.bonus);
	  }


}
