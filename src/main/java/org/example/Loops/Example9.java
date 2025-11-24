package org.example.Loops;

public class Example9 {
/*    1      1
      12    21
      123  321
      12344321      */
public static void main(String[] args) {
    int n=6;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++) System.out.print(j);
        for(int k=1;k<=n*2-2*i;k++) System.out.print(" ");
        for(int m=i;m>=1;m--) System.out.print(m);
        System.out.println();
    }
}
}
