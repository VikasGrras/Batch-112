package org.example.Loops;

public class Main {
    //Iterations->same code repeating execution
    //for ,while,do-while,for each loops
    public static void main(String[] args) {
        //for(init1;cond258;increm/decrement47){body36}
        //whenever you know num of iteration then use for
        //wap to print n to 1  num ;
        //wap to to even num upto 20
        //fibonacci series
        //factorial find
        //reverse a num int n=12345; int rev=54321;
        //check palindrome
        //count digit int num=123354 count=6
        //sum of digit int num=12345 sum=15
        // 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
        // 1(+2) 3(+3) 6(+4) 10(+5) 15(-2) 13(-3) 10(-4) 6(-5) 1
        //5*4*3*2*1=120
       // 0 1 1 2 3 5 8 13 21
        int num=12345;//1234
        int rev=0;//54
        for( ;num!=0; ){
            rev=rev*10+num%10; //5*10+4=50+4=54
            num=num/10;
        }
        System.out.println(rev);

    }
}
