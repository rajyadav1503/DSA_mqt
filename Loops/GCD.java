package DSA_mqt.Loops;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = 1;
        // for(int i =2;i<=Math.min(num1,num2);i++){
        //     if(num1 % i==0 && num2 %i==0){
        //             gcd = i;
        //     }
        // }
        // System.out.println(gcd);

        // Run the for loop from min to 2.

        // for(int i =Math.min(num1,num2);i>=2;i--){
        //     if(num1 % i==0 && num2 %i==0){
        //             gcd = i;
        //             break;
        //     }
        // }
        // System.out.println(gcd);
        
        // By using while loop by Euclidian algorithm (divident and divisor method1)
        
        int max = 60;  //divisor
        int min = 18;  //divident
        
        while(min != 0){
            int rem = max % min;
            max = min;
            min = rem;  
        }
        System.out.println(max);

        //1st iteration:     2nd iteration
        // rem=6             rem=0
        // max=18;           max=6
        // min=6;            min=0

    }
}
