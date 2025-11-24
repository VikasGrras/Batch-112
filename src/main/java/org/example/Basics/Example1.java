package org.example.Basics;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        //number of iteration->for
        //initialization,condition check,by default true,body,increment/decrement
     String s="AkshssSyA";
        char[] chars=s.toCharArray();
        int[] frequency=new int[chars.length];
        int var=0;
        for(char c:chars){
            int count=0;
            for(int i=0;i<chars.length;i++){
                if(c==chars[i]){
                    count++;
                }
            }
            frequency[var]=count;
            var++;

        }
        System.out.println(Arrays.toString(frequency));

    }
}
