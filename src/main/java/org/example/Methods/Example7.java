package org.example.Methods;

public class Example7 {
    //factariol of any num  5=5*4*3*2*1 using recursion
    //sum using recursion n=5 -> 1+2+3+4+5=15
    //for(i->1 to n ) =120 //1*2*3*4*5=120
    //
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n,1));
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);

    }
    public static int factorial(int n,int fact){
        if(n<1)return fact;
        fact=fact*n;
        return factorial(n-1,fact);
    }


}
