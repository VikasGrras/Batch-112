package org.example.Basics;

public class Datatypes {
    //byte=8 bits->1 byte->_ 0,1 -> 2p8-> 256 -> -128 to 127
    //__ -> 00,01,10,11
    //________ -> 2pbits
    //Literals
    //Integral(byte,short,int,long) Literals
    //by default int
        //Decimal literals->base10 -> 0-9  int a=10;
        //Octal literals->base8 -> 0-7  int b=078; prefix with 0
        //Hexadecimal literals -> base16 0-9 ABCDEF int c=0x45;
        //Binary literals -> 0 or 1 base 2 int d=0b1010;
    //Floating Point(float,double) Literals
    //by default double
    //float-> float v=12.243f; suffix with f compulsory
    //double-8 byte //d is optional
    //char->(character literals)
    // 2 byte 16 bits 2p16 -> 0 to 2p16 -1 ->0 to 65535
    // char c='a'; single quote single value
    // 0 to 65535 integer value
    // hexadecimal notation  '\u0000'
    //boolean->literals true false by default false
    //String literals double quote
    //Null literal ->default value of non primitive datatypes ki

    public static void main(String[] args) {
        //32 bits
        char c='\uFFFF';//hexadecimal to int 65535
        System.out.println(c);

    }
}
