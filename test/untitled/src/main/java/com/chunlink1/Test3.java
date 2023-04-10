package com.chunlink1;

import com.chunlink.Test;

public class Test3 extends Test {
    void subFun1(){
        i = 1;//不同包的子类 也不能访问父类的默认权限的成员属性或方法
        fun();//protected的属性与方法可以被不同包的子类访问，或继承。
    }
}
