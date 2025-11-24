package org.example.Operators;

public class IncrementDecrement {
    //increment-> post pre(++)
    //decrement-> post pre(--)
    public static void main(String[] args) {
        int a=10;
        System.out.println(a--);//10
        System.out.println(a++);//9
        System.out.println(--a);//9
        System.out.println(++a);//10
    }
}
