package org.example.Array.Sorting;

public class QuickSort {
    //pivot
    //left small and right greater
    //{10,7,8,9,1,5}
    //{1,5,10,7,8,9}
    //{1,5,7,8,9,10}
    public static void main(String[] args) {
        int[] arr={10,7,8,9,1,5};
        QuickSort(arr,0,arr.length-1);
    }
    //O(n*i)
    //O(np2)
     public static void QuickSort(int[] arr,int low,int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);//1
            QuickSort(arr,low,pivotIndex-1);
            QuickSort(arr,pivotIndex+1,high);
        }
     }
     public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1; // -1
         //{1,7,8,9,10,5}
         //{1,5,8,9,10,7}
         //{1,5,7,8,10,9}
        for(int j=low;j<high;j++){ //0
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;//1
     }

}
