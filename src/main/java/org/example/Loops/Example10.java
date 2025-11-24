package org.example.Loops;

public class Example10 {
 /*   1
      01
      101
      0101
      10101    */
  public static void main(String[] args) {

     for(int i=1;i<=5;i++){
         int k;
         if(i%2==0) k=0;
         else k=1;
         for(int j=1;j<=i;j++){
             if(k==0)k=1;
             else k=0;
             System.out.print(k);
         }
         System.out.println();
     }
   }
}
