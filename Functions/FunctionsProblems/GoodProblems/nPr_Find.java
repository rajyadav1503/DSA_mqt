package DSA_mqt.Functions.FunctionsProblems.GoodProblems;

import java.util.Scanner;

public class nPr_Find {
     static long nPr(long n, long r) {
        // code here
        if(r==0) return 1;
        if(r>n) return 0;
        long res=1;
        for(int i=1;i<=r;i++){
            res=res*(n-i+1);
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1= sc.nextLong();
        long num2= sc.nextLong();
        long ans = nPr(num1,num2);
        System.out.println(ans);
    }
}
