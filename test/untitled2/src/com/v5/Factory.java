package com.v5;

public class Factory {
    public Product factoryMethod(String arg){
        if(arg.equalsIgnoreCase("A")){
            return new ConcreteProductA();
        }else if(arg.equalsIgnoreCase("B")){
            return new ConcreteProductB();
        }
        else
            return null;
    }
}
abstract  class Product{
    void print(){
    }
    abstract void t();
}

class ConcreteProductA extends Product{
    void print(){
        System.out.println("ConcreteProuductA ");
    }

    @Override
    void t() {

    }
}
class ConcreteProductB extends Product{
    void print(){
        System.out.println("ConcreteProuductB ");
    }

    @Override
    void t() {

    }
}
