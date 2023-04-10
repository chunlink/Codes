package com.v7;

public class StructFunTest {
    int f;
    int g;
//    public StructFunTest(){
//        f=1;
//        g = 1;
//    }
    public StructFunTest(int i,int j){
        f = i ;
        g = j;
    }
}
class SubStructFunTest extends StructFunTest{
    int h;
    public SubStructFunTest(int h){
        super(4,5);
        this.h = h;
    }
}
class Test{
    public static void main(String[] args) {
        SubStructFunTest sb = new SubStructFunTest(5);
        System.out.println(sb.h+" "+sb.f+" "+sb.g);
    }
}