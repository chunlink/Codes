package com.v4;

public class Circle {
    double rr;
    double area(){
        return 3.14*rr*rr;
    }
}

class Fan extends Circle{
    double arc;//扩展的功能
    @Override
    double area() {//覆盖
        return super.area()*arc/(2*3.14);
    }
}
