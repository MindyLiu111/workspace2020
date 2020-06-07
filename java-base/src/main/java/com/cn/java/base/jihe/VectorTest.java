package com.cn.java.base.jihe;

import java.util.Vector;

/**
 * 1 数据结构
 *    1.1 内部数据结构是数组,默认数组的初始值是10
 * 2 线程安全性
 *    线程安全,效率低
 */
public class VectorTest {

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("a");
    }
}
