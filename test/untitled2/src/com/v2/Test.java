package com.v2;

import java.sql.SQLOutput;
import java.util.Scanner;
import com.v1.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(m+" " +n+" 的最大公约数是："+MyMath.theBigDiv(m,n));
        System.out.println(m+" " +n+" 的最小公倍数是："+m*n/MyMath.theBigDiv(m,n));
    }
//public static void main(String[] args) {
//    CaiCai caiCai = new CaiCai();
//    caiCai.play();
//}
//public static void main(String[] args) {
//    MyArray myArray = new MyArray(8);
//    myArray.print();
//    System.out.println();
//    myArray.insertArray(6,3);
//    myArray.print();
//}
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    String p = scanner.next();
//    System.out.println(p);
//}
//public static void main(String[] args) {
//    XYouXi xi = new XYouXi();
//    xi.play();
//}
}
