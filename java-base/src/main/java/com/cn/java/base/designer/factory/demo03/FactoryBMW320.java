package com.cn.java.base.designer.factory.demo03;

//具体的工厂
public class FactoryBMW320 implements FactoryBMW{  
  

    public BMW320 createBMW() {  
  
        return new BMW320();  
    }  
  
}  