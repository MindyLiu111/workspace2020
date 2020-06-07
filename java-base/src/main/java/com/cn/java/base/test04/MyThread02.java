package com.cn.java.base.test04;

public class MyThread02  implements Runnable{
	
	

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			 System.out.println("hello....."+Thread.currentThread().getName());
		}
		
	}

}
