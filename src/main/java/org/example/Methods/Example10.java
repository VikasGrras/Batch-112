package org.example.Methods;

public class Example10 {
   /* *****
      *****
      *****
      *****
      *****  */
    public static void main(String[] args) {
        int n=5;
        row(1);
    }
    public static void row(int i){
        if(i>5)return;
        row(i+1);
        System.out.println(i);

    }




}
