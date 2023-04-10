package com.chunlink.v1;

public class PackageExtends extends PackageTestv1{
    void newTest(){
        t1 = 1;
    }
}
class PackageAccess1{
    void newTest(){
        PackageTestv1 packageTestv1 = new PackageTestv1();
        packageTestv1.t1 = 2;
    }
}
