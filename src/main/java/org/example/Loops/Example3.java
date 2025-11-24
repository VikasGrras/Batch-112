package org.example.Loops;

public class Example3 {
    //[2,3,0,1,0,4]
    //[2,3,1,4,0,0]
    public static void main(String[] args) {
        int[] arr={1,2,30,44,50,50,3};
        int largest=0;
        int secondLargest=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>largest){
               secondLargest=largest;
               largest=arr[i];
           }else if(arr[i]>secondLargest){
               secondLargest=arr[i];
           }
        }
        System.out.println(secondLargest);
        System.out.println(largest);

    }
}
