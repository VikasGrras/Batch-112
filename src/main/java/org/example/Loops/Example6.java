package org.example.Loops;

public class Example6 {
/*  *(1,1)         *(1,5)
        *(2,2)  *(2,4)
            *(3,3)
       *(4,2)   *(4,4)
    *(5,1)         * (5,5)      */
public static void main(String[] args) {
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            if((i==j)||(i+j)==6) System.out.print("("+i+","+j+")");
            else System.out.print("  ");
        }
        System.out.println();
    }
}
}
