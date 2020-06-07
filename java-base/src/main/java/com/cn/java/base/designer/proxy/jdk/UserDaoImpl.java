package com.cn.java.base.designer.proxy.jdk;

public class UserDaoImpl implements UserDao {
    public void save() {

        System.out.println("保存操作..............");
    }

    public void delete() {
        System.out.println("删除操作..............");
    }

    public void update() {
        System.out.println("修改操作..............");
    }

    public void query() {
        System.out.println("查询操作..............");
    }
}
