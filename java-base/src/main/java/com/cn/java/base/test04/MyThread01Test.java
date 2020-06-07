package com.cn.java.base.test04;

public class MyThread01Test {

	  public static void main(String[] args) {
		
		  MyThread01 thread01 = new MyThread01();
		  thread01.setName("thread--01");
		  thread01.start();	  
		  
		  MyThread01 thread02 = new MyThread01();
		  thread02.setName("thread--02");
		  thread02.start();	
		  
		  MyThread01 thread03 = new MyThread01();
		  thread03.setName("thread--03");
		  thread03.start();	
	}
	  
	  
}
