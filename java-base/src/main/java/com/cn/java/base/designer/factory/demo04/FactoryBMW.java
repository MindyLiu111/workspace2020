package com.cn.java.base.designer.factory.demo04;

//现在的工厂是一个接口
interface FactoryBMW {

    BMW createBMW1();
    BMW createBMW2();

    Aircondition createAirC();
}