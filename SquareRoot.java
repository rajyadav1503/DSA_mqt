package DSA_mqt;

import java.util.Scanner;

public class SquareRoot {
    public static int mySqrt(long x) {
        if(x==0 || x==1) return  (int) x;
        long i = 1;
        while(i*i<=x){
            i++;
        }
        return (int)i-1;  //beacuse we want closest int square root if the no is not perfect square
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        int sqrt =  mySqrt(num1);
        System.out.println(sqrt);
    }
}
