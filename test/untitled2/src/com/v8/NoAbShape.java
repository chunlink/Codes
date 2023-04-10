package com.v8;

public class NoAbShape {
}

class Circle1{
    private double radius;
    public Circle1(double r){
        radius = r;
    }

    double area() {
        return 3.14*radius* radius;
    }

    double around() {
        return 2*3.14*radius;
    }
}
class EquiTrigle1{

    private double edge;
    private double height;
    public EquiTrigle1(double e,double h){
        edge = e;
        height = h;
    }
    double area() {
        return 1/2.0*edge*height;
    }

    double around() {
        return 2*Math.sqrt(edge*edge/4+height*height)+edge;
    }
}
class Test1{
    public static void main(String[] args) {
        operation1(new Circle1(2.3));
        operation2(new EquiTrigle1(8,3));
    }
    static void operation1(Circle1 shape){
        System.out.println(shape.area());
        System.out.println(shape.around());
    }
    static void operation2(EquiTrigle1 shape){
        System.out.println(shape.area());
        System.out.println(shape.around());
    }
}