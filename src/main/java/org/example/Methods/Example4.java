package org.example.Methods;

public class Example4 {
    //String is palindrome using recursion
    public static void main(String[] args) {
        String s="abcba";//yahskA
        checkPalindrome(s,s.length(),0);

    }
    public static void checkPalindrome(String s,int n,int i){///i==n-i-1 // 0==2
        if(i>=n/2) {
            System.out.println("String is palindrome");
            return;
        };
        s=s.toLowerCase();
        if(s.charAt(i)==s.charAt(n-i-1)){
            checkPalindrome(s,n,i+1);
        }else{
            System.out.println("String is not Palindrome");
        }
    }
}
