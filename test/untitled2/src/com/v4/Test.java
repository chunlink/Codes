package com.v4;

public class Test {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.rr=2;
        System.out.println(c.area());
        Fan f = new Fan();//创建对象
        f.arc = 1.57;
        f.rr=2;//rr是继承来的资源、功能（属性、方法）
        System.out.println(f.area());
    }
}
