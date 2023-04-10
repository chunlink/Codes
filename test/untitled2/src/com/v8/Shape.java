package com.v8;

import jdk.internal.org.objectweb.asm.tree.FrameNode;

import java.sql.Statement;

public abstract class Shape {
    final static double PI = 3.14;
    abstract double area();
    abstract double around();
}

class Circle extends Shape{
    private double radius;
    public Circle(double r){
        radius = r;
    }

    @Override
    double area() {
        return PI*radius* radius;
    }

    @Override
    double around() {
        return 2*PI*radius;
    }
}
class EquiTrigle extends Shape{

    private double edge;
    private double height;
    public EquiTrigle(double e,double h){
        edge = e;
        height = h;
    }
    @Override
    double area() {
        return 1/2.0*edge*height;
    }

    @Override
    double around() {
        return 2*Math.sqrt(edge*edge/4+height*height)+edge;
    }
}
class Rectangle extends Shape{

    private double edgeA;
    private double edgeB;
    public Rectangle(double a,double b){
        edgeA = a;
        edgeB = b;
    }

    @Override
    double area() {
        return edgeA*edgeB;
    }

    @Override
    double around() {
        return 2*(edgeA+edgeB);
    }
}
class Test{
    public static void main(String[] args) {
        Shape shape;
        operation(new Circle(2.3));
        operation(new EquiTrigle(8,3));
        operation(new Rectangle(4,5));
    }
    static void operation(Shape shape){
        System.out.println(shape.area());
        System.out.println(shape.around());
    }
}
