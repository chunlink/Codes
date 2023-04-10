package com.chunlink.v2;
import  com.chunlink.v1.PackageTestv1;
public class PakageTest extends PackageTestv1 {
    void Test1(){
       t1 = 1;
    }
}
class PakageTest2{
    void test1(){
        PackageTestv1 packageTestv1 = new PackageTestv1();
        packageTestv1.t1 = 1;
    }
}
