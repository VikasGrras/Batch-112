package org.example.Array;

public class BinarySearch {
    //int[] arr1={12,12,34,55};
    //sorted
    public static void main(String[] args) {
        String[] arr1={"aba","abb","abd"};//
        //97 98 99 100 101
        //101-98=3
        String key="abc";//str1.c()str
        System.out.println(arr1[0].compareTo(arr1[1]));


    }
    static int binarySearch(String[] arr,String key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            int value=arr[mid].compareTo(key);//abb.comapre abc -1
            if(value==0) return mid;
            else if (value<0) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

}
