package com.cn.java.base.reflect;

public class User {

    public  Integer id;
    private  String name;
    public Integer age;


    public User() {
    }

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public  String  showInfo(){

        return "显示用户信息..................";
    }


    private  void buyBook(Double money){
        System.out.println("买书去...............花费 : "+money);
    }

       public void showName(){

        System.out.println("用户姓名:" + this.getName());
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
