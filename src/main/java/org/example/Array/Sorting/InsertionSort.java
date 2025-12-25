package org.example.Array.Sorting;

import java.util.Arrays;

public class InsertionSort {
    //bubble-last
    //selection-start
    //insertion-correct
    //{13,46,24,52,20,9} //key=20
    //{13,46,46,24,52,9}
    public static void main(String[] args) {
        int[] arr={13,46,24,52,9,9};
        int i=1;
        do{
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            i++;
        }while(i<arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
