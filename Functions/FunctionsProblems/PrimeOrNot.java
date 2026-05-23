package DSA_mqt.Functions.FunctionsProblems;

import java.util.Scanner;

public class PrimeOrNot {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2;i<n;i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        if(isPrime(num1)){
            System.out.println("Yes Prime");
        }else{
            System.out.println("Not a prime");
        }
    }
}
