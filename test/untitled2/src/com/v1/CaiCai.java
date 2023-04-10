package com.v1;

import java.util.Random;
import java.util.Scanner;

public class CaiCai {
    int num;
    public CaiCai(){
        num = new Random().nextInt(10);
    }
    public boolean play(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int the;
        for(int i = 1;i<=3;i++){
            System.out.println("请输入一个10以内的整数。。。。。。。");
            the = scanner.nextInt();
            if(num<the){
                System.out.println("大");
            }
            else if(num>the){
                System.out.println("小");
            }else {
                System.out.println("成功！");
                flag = true;
                break;
            }
        }
        return flag;
    }
}
