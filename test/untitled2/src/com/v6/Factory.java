package com.v6;

public class Factory {
    public static Cipher getCipher(int select){
        if(select == 1)
            return new CaesarCipher();
        else
            return null;
    }
}
