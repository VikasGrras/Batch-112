package org.example.Loops;

public class Example8 {
 /*      *
       * * *
      *  *  *
         *
         *   */
 public static void main(String[] args) {
     int n=3;//7
     int mid=n/2+1;
     for(int i=1;i<=n;i++){
         for(int j=1;j<=n;j++){
             if(j==mid||(i+j)==mid+1||(j-i)==mid-1)
             System.out.print("* ");
             else System.out.print("  ");
         }
         System.out.println();
     }
 }
}
