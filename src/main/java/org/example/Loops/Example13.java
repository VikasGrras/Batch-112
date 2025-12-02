package org.example.Loops;

public class Example13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if(((j<=i)&&(i+j<11))||((j>i)&&(i+j)>=11)) System.out.print("*");
                else System.out.print(" ");
            }
                System.out.println();

        }
    }
}
