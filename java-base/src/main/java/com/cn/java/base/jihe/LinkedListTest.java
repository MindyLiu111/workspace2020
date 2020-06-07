package com.cn.java.base.jihe;

import java.util.LinkedList;

/**
 * 1 数据结构
 *   1.1 内部是一个双向链表
 *   1.2 查询速度慢,增删速度快
 *
 * 2 线程是否安全
 *   不安全,效率高
 */
public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<Object> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("a");

        System.out.println(list);
    }
}
