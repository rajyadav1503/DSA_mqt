package DSA_mqt.Loops;

import java.util.Scanner;

public class PrimeCheck {

     static boolean isPrime(int n) {
        if(n<=1){
             return false;
        }
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) 
            return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if(isPrime(num1)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a prime");
        }
        
        // int i = 2;
        // while (i<= Math.sqrt(num1)){
        //     if (num1 % i == 0) {
        //         System.out.println("Not a prime");
        //         break;
        //     }else{
        //         System.out.println("Prime");
        //         break;
        //     }i++;
            
        // }
    }
}
