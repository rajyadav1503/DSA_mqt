package DSA_mqt.Functions.FunctionsProblems;

import java.util.Scanner;

public class PrimeOrNot {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    //Optimized version
    static boolean isPrime2(int n){
        if(n<=1)return false;
        if(n==2)return true;
        if(n%2==0)return false;  // by this we can skip the check for even no in our for loop and increment the loop by +2;
        
        for(int i = 3;i<=i*i;i+=2){   // Here instead of using Math.sqrt every time we can use i*i as it is less expensive than the float Math.sqrt method.
            if(n%i==0){
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
