package org.example.Loops;

public class Example1 {
    //1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
    public static void main(String[] args) {
        //do{ }while();
        int count=1;
        int i=1;
        while(i<=5){
            if(count<=i){
                System.out.print(i+" ");
                count++;
            } else{
                count=1;
                i++;
            }
        }
    }
}
