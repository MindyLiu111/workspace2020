package com.cn.java.base.jihe;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	
	public static void main(String[] args) {
		
        Map<Student,String> map = new HashMap<Student,String>();
		
		Student zhangsan = new Student("张三",20);
		Student lisi = new Student("李四",21);
		
		Student wangwu = new Student("王五",22);
		Student wangwuwu = new Student("王五五",22);
		
		map.put(zhangsan,"张三");
		map.put(lisi,"李四");
		map.put(wangwu,"王五");
		map.put(wangwuwu,"王五五");
		
		System.out.println(map);

		
	}

}
