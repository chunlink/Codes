package com.chunlink;

class Test1 {
    Test t;//成员变量

    void fun(){//成员方法
       t.acc();
       t.i=4;
       t.fun();//在Test里被定义为protected的属性与方法，同包访问的时候是没有问题。
    }

}
