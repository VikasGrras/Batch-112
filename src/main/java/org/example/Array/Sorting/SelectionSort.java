package org.example.Array.Sorting;

public class SelectionSort {
    //{13,46,24,52,20,9}
    //{9,46,24,52,20,13}
    //{9,13,24,52,20,46}
    //{9,13,20,52,24,46}
    //{9,13,20,24,52,46}
    //{9,13,20,24,46,52}
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        for(int i=0;i<arr.length-1;i++){//1=46
            int minIndex=i;//5
            for(int j=i+1;j<arr.length;j++){//5
                if(arr[minIndex]>arr[j]){//13
                    minIndex=j;//5
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
}
