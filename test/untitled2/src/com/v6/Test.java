package com.v6;


public class Test {
    public static void main(String[] args) {
        Cipher cipher = Factory.getCipher(1);
        System.out.println(cipher.encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
        System.out.println(cipher.decode("WKH TXLFN EURZQ IR[ MXPSV RYHU WKH OD]\\ GRJ"));
    }
}
