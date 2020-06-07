package com.cn.java.base.designer.factory.demo02;

public class Customer {

    public static void main(String[] args) {

        Factory factory = new Factory();

        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);

        System.out.println("客户从工厂取车.....");
    }
}
