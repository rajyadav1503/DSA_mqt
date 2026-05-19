package DSA_mqt.Loops;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = 1;
        for(int i =2;i<=Math.min(num1,num2);i++){
            if(num1 % i==0 && num2 %i==0){
                    gcd = i;
            }
        }
        System.out.println(gcd);
        
        // By using while loop by divident and divisor method1
        while(num1 != 0){
            int temp = num1 % num2;
            num2 = temp;

        }
    }
}
