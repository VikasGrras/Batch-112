package org.example.Array.Sorting;

import java.util.Arrays;

public class MergeSort {
    //O(nlogn) //divide and conquer
    ////{13,46,24,52}
    //{13,46} {24,52}
    //{13} {46} {24} {52}
    //{13,46}  {24,52}
    //{13,24,46,52}
    //divide the array into two
    //make pointer which points two different array
    //p1=0 //p2=mid //p3=mid+1 //p4=length
    public static void main(String[] args) {
        int[] arr={5,3,8,2,1};//n
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr){//{5,3,8,2,1};
        //{8,2,1}
        if(arr.length<=1) return;
        int mid=arr.length/2;//1
        int[] left=new int[mid];//{8}
        int[] right=new int[arr.length-mid];//{2,1}

        for(int i=0;i<mid;i++){//012345
            left[i]=arr[i];
        }
        for(int i=mid;i<arr.length;i++){
            right[i-mid]=arr[i]; //right[0]=arr[3]
        }
        mergeSort(left);//{3,5}
        mergeSort(right);//{128}
        merge(arr,left,right);//{1,2,3,5,8}

    }

    public static void merge(int[] arr,int[] left,int[] right){
        int i=0; int j=0; int k=0;//1 //1
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }}
            while(i<left.length){
                arr[k++]=left[i++];
            }
            while(j<right.length){
                arr[k++]=right[j++];
            }

    }
}
