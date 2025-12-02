package org.example.Methods;

public class Example3 {
    //1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
    public static void main(String[] args) {
        print(1,1);
    }

    public static void print(int i,int count){
        if(i>5)return;
        if(count<=i)
        {
            System.out.print(i+" ");
            count++;
        }
        else{
            count=1;
            i++;
        }
        print(i,count);
    }
}
