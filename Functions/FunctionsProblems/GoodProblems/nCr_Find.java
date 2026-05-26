package DSA_mqt.Functions.FunctionsProblems.GoodProblems;

import java.util.Scanner;

public class nCr_Find {
    /*    public int nCr(int n, int r) {       //This will not work properly for large numbers.
        // code here
        if(r>n) return 0;
        if(r==0 || r==n) return 1;
        if(r>n/2) r= n-r;
        long num1=1;
        long num2=1;
        for(int i=1;i<=n;i++){
            num1*=i;
        }
        for(int i=1;i<=r;i++){
            num2*=i;
        }
        long num3=1;
        if((n-r)>0){
            for(int i=1;i<=n-r;i++){
                num3*=i;
            }
        }else{
            num3=0;
        }
        long ans = num1/(num2*num3);
        return (int)(ans);
    }
* */

        static int nCr(int n,int r){
            if(r>n) return 0;
            if(r==0 || r==n) return 1;
            if(r>n/2)  r = n-r;
            long res = 1;
            for(int i=1;i<=r;i++){
                res = res * (n-i+1)/i;
            }
            return (int)(res);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        int ans = nCr(num1,num2);
        System.out.println(ans);
    }
}
