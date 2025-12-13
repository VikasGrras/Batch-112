package org.example.Methods;

import java.util.Arrays;

public class Example12 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        //10,60,20,70,30,80,40,90,50,100
        //1,3,5,7
        //int a=10;
        //a=20
        //list-> 0 Arraylist-> insertion and deletion
        // 2,3,4,6,7
        //left  4,5,6,7,2,3 right
        // k=2
        //
        int mid=arr.length/2;
        int j=4;
        int a=1;
        for(int i=mid;i<arr.length;i++){//5 6 7 8 9
            int value=arr[i];
            for(int k=i;k>i-j;k--){//5//4//3//2
                arr[k]=arr[k-1];
            }
            j--;
            arr[a]=value;
            a+=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
