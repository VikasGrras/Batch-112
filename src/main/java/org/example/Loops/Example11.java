package org.example.Loops;

public class Example11 {
 /*   A
     ABA
    ABCBA
   ABCDCBA
  ABCDEDCBA     */
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            for(int k=n-1;k>=i;k--) System.out.print(" ");
            char c='A';
            for(int j=1;j<i*2;j++){
                    System.out.print(c);
                if(j<i) ++c;
                else --c;
            }
            System.out.println();
        }
    }
}
