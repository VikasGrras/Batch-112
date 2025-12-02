package org.example.Methods;

public class Example5 {
    public static void main(String[] args) {
        String s="sklent";
        String s1="listen";
        boolean check=true;
        int count=anagram(s,s1,0,0,0);
        System.out.println(count==s.length());


    }
    // 0 ( 0 1 2 3 4 5)
    public static int anagram(String s,String s1,int count,int i,int j){
        if(i==s.length()) return count;
        if(s.charAt(i)==s1.charAt(j)){
            count++;
        }
        if(j<s.length()-1){
            ++j;
        }else{
            j=0;
            ++i;
        }

      return   anagram(s,s1,count,i,j);
    }
}
