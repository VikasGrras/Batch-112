package org.example.Methods;

public class Example {
    //accessModifier returnType MethodName(Paramters){body};->Method Declaration
    //Methodname(Arguments);->Method Call
    //Stack Area->LIFO
    //top method executes
    //main
    //recursion-> when method calls itself
    //how to avoid stakeOverFlowError-> BaseCondition
    //wap to print 10 to 1 num using recursion
    public static void main(String[] args) {
        // 6 5 4 3 2 1 2 3 4 5 6
        //even num upto 20
        //reverse a given num int n=12345; int rev=54321
        //count num of digit using rec int num=1234
        //summ of digit
        // 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
       run(1);
        System.out.println("main");

    }
    public static void run(int n){
        System.out.println(n);
     if(n>5)return;
     run(n+1);
        System.out.println(n);


    }
}
