package com.cn.java.base.test04;

public class MyThread01  extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			 System.out.println("hello....."+this.getName());
		}
		
	}

}
