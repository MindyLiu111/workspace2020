package com.cn.java.base.designer.factory.demo03;


public class Customer {

    public static void main(String[] args) {

        FactoryBMW factory320 = new FactoryBMW320();
        FactoryBMW factory523 = new FactoryBMW523();
        FactoryBMW factory666 = new FactoryBMW666();

        BMW bmw320 = factory320.createBMW();

        BMW bmw523 = factory523.createBMW();

        BMW bmw666 = factory666.createBMW();



        System.out.println("客户从工厂取车.....");

    }


}
