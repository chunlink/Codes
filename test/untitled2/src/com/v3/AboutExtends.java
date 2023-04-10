package com.v3;

public class AboutExtends {
    String name = "AboutExtends";

    void findTheNo1(){
        System.out.println("我是 "+name);
    }
    String getName(){
        return this.name;
    }
}
class  AE1 extends  AboutExtends{
    public AE1(String name){
        this.name = name;
    }
    void findTheNo1(){
        System.out.println("我是 "+name+",我父亲是"+super.getName());
    }
}
