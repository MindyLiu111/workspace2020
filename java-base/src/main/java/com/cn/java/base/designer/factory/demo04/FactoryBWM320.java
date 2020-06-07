package com.cn.java.base.designer.factory.demo04;

/**
 * 创建BWM320车
 */
class FactoryBWM320 implements FactoryBMW {

    public  BMW320 createBMW1(){
           //组装空调略......
           return new BMW320();
    }
    public  BMW666 createBMW2(){
        //组装空调略......
        return new BMW666();
    }

    public AirconditionBWM320 createAirC(){ //空调
      return new AirconditionBWM320();
    }
}