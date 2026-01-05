package org.example.Array;

public class Example1 {
    public static void main(String[] args) {
        //input={10,5,3,4,3,5,5,10}
        //output={10}
        int[] arr={10,5,3,4,3,5,5,10};
        boolean value=false;
        for(int i=0;i<arr.length;i++){
            if(value==true) break;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    value=true;
                    break;
                }
            }
        }


    }
}
