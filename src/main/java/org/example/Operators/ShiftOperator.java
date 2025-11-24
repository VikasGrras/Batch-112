package org.example.Operators;

public class ShiftOperator {
    //left shift(<<) num mutliply  by num*2pbits= -4*2p2 ->-16
    // signed right shift(>>) num divide by num/2pbits -> 4/2p6 -> 0
    //if MSB is 1 then add if 0 then add 0
    // unsigned right shift(>>>)left msb  right
    //MSB is 1 or 0 add 0
    public static void main(String[] args) {
        System.out.println(-4>>8);//2 // bits%32=0
       // 111111.......>>2 ->
        //00000...00000
        //  000....000001


    }
}
