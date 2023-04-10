package com.chunlink;

public class SubTest extends Test{
    void subFun(){
        i = 0;
        fun();//protected的方法与属性可以被同包的子类访问。
        acc();
    }
}
