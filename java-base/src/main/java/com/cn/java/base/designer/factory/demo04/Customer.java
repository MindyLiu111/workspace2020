package com.cn.java.base.designer.factory.demo04;



public class Customer {

    public static void main(String[] args) {

        FactoryBWM320 factoryBMW320 = new FactoryBWM320();
        FactoryBWM523 factoryBMW523 = new FactoryBWM523();

        BMW320 bmw320 = factoryBMW320.createBMW1();
        BMW666 bmw666 = factoryBMW320.createBMW2();

        System.out.println("客户从工厂取车.....");

    }


}
