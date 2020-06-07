package com.cn.java.base.jihe;

import java.util.ArrayList;

/**
 * 1 数据结构
     * 1.1 内部数据结构是数组,
     *     默认数组的初始值是10，
     *     每次扩容,（grow()）先判断当前容量是否足够,如果不够则会扩容原来的1.5倍
     * 1.2 查询快增删慢
 * 2 线程是否安全
 *   线程不安全(只要不是jdk1的集合类,都线程不安全),因此效率高
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("a");

        System.out.println(arrayList);
    }


}
