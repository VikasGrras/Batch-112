package org.example.Methods;

public class Example11 {
    // 3,2,5,10,4
    public static void main(String[] args) {
        int[] arr={3,2,5,10,4};
        int large=10;
        for(int i=1;i<=large;i++){//1
            boolean check=false;
            for(int j=0;j<arr.length;j++){//
                if(i==arr[j]) check=true;
            }
            if(!check) System.out.print(i+" ");
        }
    }
}
