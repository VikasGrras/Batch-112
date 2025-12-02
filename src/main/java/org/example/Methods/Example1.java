package org.example.Methods;

public class Example1 {
    public static void main(String[] args) {
        int num=12321;
        int result=reverse(num,0);
        System.out.println(result==num);
    }

    public static int reverse(int num,int rev){
        if(num==0) return rev;
        return reverse(num/10,rev*10+num%10);

    }

}
