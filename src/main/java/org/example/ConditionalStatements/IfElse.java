package org.example.ConditionalStatements;

public class IfElse {
    public static void main(String[] args) {
        //if(condition(boolean)){true}else{else}
        //if(condition){true}
        //if(condition){trueif(condition){true}else{false}}else{false}
        //if(condition){true}else if(condition){true}{true}
        //switch vs if-else
        //== operator
        //Collection primitive type
        //Heterogenuous -> Object int short
        //byte,short,int,char,String,enum final constants ->datatype(7 )
        String s="abcdefabcdeaa";//j=0 -> i=4 str="abcd"
        //j=4  i=9   i-j 5
        int count=1;
        int longest=0;
        int j=0;
        for(int i=0;i<s.length()-1;i++){
            if((char)(s.charAt(i)+1)==(s.charAt(i+1))){//b(i)==b
                count++;
                if(count>longest){
                    j=i-longest+1;
                }
               longest= Math.max(count,longest);
            }else{
                count=1;
            }
        }
        System.out.println(s.substring(j,j+longest));
        System.out.println(longest);



    }
}
