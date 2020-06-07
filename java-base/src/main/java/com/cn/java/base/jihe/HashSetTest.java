package com.cn.java.base.jihe;

import java.util.HashSet;

/**
 * 1 数据结构
 *   1.1 按照HashCode的值存储数据
 *   1.2 底层维护的是HashMap,HashMap 底层维护的是一个数组, 初始值是16，
 *       每次add()方法的时候,就会触发resize()
 *      每次扩容是原来的1倍
 *   1.3 不能存放重复值
 *       add()  ---底层调用 HashMape的put()  --putValue(hash(key),key)
 *              ---1  判断tab[] 是否为空,为空
 *              ---2  如果当前节点值与存入的值的 值相同( ==  && equals())  说明该值已存在,不存直接返回 null
 *              ---3 如果是TreeNode 就直接转存到红黑二叉树
 *              ---4 向链表插入元素--先添加Node节点到链表中--判断是否超过阈值--超过则将节点转存到红黑二叉树
 *                  --判断二叉树中是否存在相同的值,存在则不存
 *              ---5 最后存入之前判断是否有旧值,则存储新值并返回旧值
 *
 *        调用存入对象的 equals() 和HashCode()
 * 2 是否有序
 *
 * 3 线程是否安全
 */
public class HashSetTest {
    public static void main(String[] args) {

        /**
         *   判断两个对象是否相等
         *  public boolean equals(Object obj) {
               return (this == obj);   //不重写就是==判断
            }
            //返回对象的hashCode值
         *  public native int hashCode();
         *
         *
         */
        Object o = new Object();
        HashSet<Object> set = new HashSet<>();

        /**
         *
         * 1  public boolean add(E e) {
             return map.put(e, PRESENT)==null;
           }
         * 2  public V put(K key, V value) {
         *
         *      //  hash(key) 存入值的hashCode  key 存入的值
                return putVal(hash(key), key, value, false, true);
           }

          3 return putVal(hash(key), key, value, false, true);
         */
        set.add("a");
        set.add("b");
        boolean result = set.add("a");
        System.out.println(result);
        set.add("b");

      //  System.out.println(set);
    }


}
