package com.v6;

/***********************************************************************
 *在密码学中，恺撒密码（英语：Caesar cipher），或称恺撒加密、恺撒变换、变换加密，
 *是一种最简单且最广为人知的加密技术。它是一种替换加密的技术，明文中的所有字母都在
 *字母表上向后（或向前）按照一个固定数目进行偏移后被替换成密文。
 *例如，当偏移量是3的时候，所有的字母A将被替换成D，B变成E，以此类推。
 *这个加密方法是以罗马共和时期恺撒的名字命名的，当年恺撒曾用此方法与其将军们进行联系。
 ***********************************************************************/
public class CaesarCipher extends Cipher{
    String cipherText="";
    char cc;
    @Override
    public String encrypt(String plainText){
        for (char c :plainText.toCharArray()
             ) {
            cc = (char)((c-32+3)%95+32);
            if(cc == '#')
                cc = ' ';
            cipherText = cipherText+cc;
        }
        return cipherText;
    }

    @Override
    public String decode(String cipherText){

        String plainText="";
        char cc;
        for (char c :cipherText.toCharArray()
        ) {
            if(c != ' ')
                cc = (char)((c-32-3)%95+32);
            else
                cc = ' ';
            plainText = plainText+cc;
        }
        return plainText;
    }

}
