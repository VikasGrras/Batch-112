package org.example.Methods;

public class Example6 {
        //sum of num upto n using recursion n=10 1+2+3....10
        public static void main(String[] args) {
           int result= sum(7);
            System.out.println(result);//
        }

        public static int sum(int n){
            if(n==0)return 0;
           return n+sum(n-1);
        }
}
