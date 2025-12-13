package org.example.Methods;

import java.util.Arrays;

public class Example9 {
     //akshay a2 k1 s1 h1 a2 y1
     public static void main(String[] args) {
         String s="akah";
         String[] res=new String[s.length()];
          for(int i=0;i<s.length();i++){
             int count=0;
             for(int j=0;j<s.length();j++){
                 if(s.charAt(i)==s.charAt(j)){
                     count++;
                 }
             }
             res[i]=s.charAt(i)+" "+count;
         }
         System.out.println(Arrays.toString(res));
     }
}
