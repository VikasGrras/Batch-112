package org.example.Operators;

public class ternaryOperator {
    public static void main(String[] args) {
        //wap to find the largest among a,b,c
        int a=10;
        int b=200;
        int c=30;
      //()? : ;
       int result=((a>b)&&(a>c))?a:((b>c)&&(b>a))?b:c;
        System.out.println(result);
    }
}
