package org.example.Array.Sorting;

import java.util.Arrays;

public class BubbleSort {
    //{2,3,4,1}
    public static void main(String[] args) {

        int[] arr={5,2,3,4,1};
        for(int i=arr.length-1;i>=0;i--){//4
            for(int j=0;j<i;j++){//0 to 2
                if(arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
