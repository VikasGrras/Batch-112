package org.example.Loops;

public class Example2 {
    // 1(+2) 3(+3) 6(+4) 10(+5) 15(-2) 13(-3) 10(-4) 6(-5) 1

    public static void main(String[] args) {
        int num=5;
        int count=2;
        int value=1;
        int i=1;
        while(i<=num*2-1){
            System.out.println(value);
            if(i<num) {
                value += count;
                count++;
            }else{
                if(i==num)count=2;
                value -= count;
                count++;
            }
            i++;
        }
    }
}
