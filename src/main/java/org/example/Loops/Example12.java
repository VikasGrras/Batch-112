package org.example.Loops;

public class Example12 {
  /*    *
       ***
      *****
     *******
    *********        */
  public static void main(String[] args) {
      //n,i,j// 1=1,2=3(2*1+1),3=5(2*2+1),4=7(2*3+1),5=9(2*4+1)
      for(int i=1;i<=5;i++){
          for(int k=4;k>=i;k--) System.out.print(" ");
          for(int j=1;j<2*i;j++){
              System.out.print("*");
          }
          System.out.println();
      }
  }
}
