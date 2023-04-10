package com.v1;

public class MyMath {
    public static int theBigDiv(int m,int n){
       int t;
       t= m%n;
       while (t!=0){
           m= n;
           n = t;
           t = m%n;
       }
       return n;
    }

}
