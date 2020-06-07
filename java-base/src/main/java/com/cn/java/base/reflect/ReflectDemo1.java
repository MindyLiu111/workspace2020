package com.cn.java.base.reflect;



/**
 * 创建class字节码对象
 * Class成员对象 都一一匹配了一个类
 * 成员变量   Field
 * 构造函数  Constructor
 * 成员方法  Method
 */
public class ReflectDemo1 {

    public static void main(String[] args) throws ClassNotFoundException {

        /**
         * 1 Oject类的getClass()方法
         */
        User user1 = new User();
        Class c1 = user1.getClass();

        User user2 = new User();
        Class c2 = user2.getClass();

        System.out.println(user1 == user2);  // false 创建一个对象就会在堆内存中开辟一个新的内存空间
        System.out.println(c1 == c2);        //true  工程启动---类加载器读取项目的class文件--读入到方法区的类加载区域



        /**
         * 2 通过Object类型的Class属性来创建
         */
        Class c3 = User.class;
        // int.class;
        // String.class;
        System.out.println(c1 == c3);



        /**
         *  3 通过Class类的forName()方法来创建
         *  <bean id="user"  class="com.reflect.demo.User"></bean>
         *  applicationContext 读取xml配置文件的以上bean的时候,就调用Class.forName()
         *  创建字节码对象的   Class.forName("com.reflect.demo.User");
         */
        Class c4 = Class.forName("com.reflect.demo.User");
        System.out.println(c1 == c4);

    }


}
