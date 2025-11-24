package org.example.ConditionalStatements;

import java.io.FilterOutputStream;

public class SwitchExpression {
    public static void main(String[] args) {
        int check=2*2;
       var result= switch (check){
            case 1->2*2;
            case 2->2;
            case 3->6;
            case 4->8;
            case 5->10;
           default -> -1;
        };
        System.out.println(result);
    }
}
