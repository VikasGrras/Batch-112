package org.example.Array;

import java.util.Arrays;

public class LargestNumber {
    //wap to check given arr is sorted
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4};
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];//i=4 //j=5

            }
        }
        for(int k=++i;k<arr.length;k++){
            arr[k]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
