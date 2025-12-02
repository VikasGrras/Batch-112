package org.example.Methods;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        Example2 obj=new Example2();
        System.out.println(obj.generateParenthesis(2));
    }
        public List<String> generateParenthesis(int n) {
            List<String> result=new ArrayList();
            paranthesis(result,0,0,n,"");
            return result;
        }

        public void paranthesis(List<String> res,int open,int close,int n,String s){
            if(s.length()==4){
                res.add(s);
                return;
            }
            if(open<n){
                paranthesis(res,open+1,close,n,s+"(");
            }
            if(close<open){
                paranthesis(res,open,close+1,n,s+")");
            }

        }

}
