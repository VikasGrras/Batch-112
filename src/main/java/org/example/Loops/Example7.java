package org.example.Loops;

public class Example7 {
 /*   *(1,1) *(1,2) *(1,3) *(1,4) *(1,5)
      *(2,1)                      *(2,5)
      *(3,1)                      *(3,5)
      *(4,1)                      *(4,5)
      *(5,1) *(5,2) *(5,3) *(5,4) *(5,5)    */
 public static void main(String[] args) {
     for(int i=1;i<=5;i++){
         for(int j=1;j<=5;j++){
             if((i==1)||(j==1)||(i==5)||(j==5)) System.out.print("* ");
             else System.out.print("  ");
         }
         System.out.println();
     }
 }
}
