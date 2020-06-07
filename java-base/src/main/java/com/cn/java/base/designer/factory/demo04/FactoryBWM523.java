package com.cn.java.base.designer.factory.demo04;

/**
 * 创建BWM320车
 */
class FactoryBWM523 implements FactoryBMW {

    public  BMW523 createBMW1(){
           //组装空调略......
           return new BMW523();
    }
    public  BMW523 createBMW2(){
        //组装空调略......
        return new BMW523();
    }
    public AirconditionBWM523 createAirC(){ //空调
      return new AirconditionBWM523();
    }
}