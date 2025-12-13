package org.example.Methods;

public class Example1 {
    public static void main(String[] args) {
        int num=5;
        int result=reverse(num);//0
        System.out.println(result);
    }
    //top method will execute
    //value will be returned to stack method call
    //main //5//4/3/2/1/0


    public static int reverse(int num){
        if(num==0) return num;
      return reverse(num-1);
    }

}
