package DSA_mqt.Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int fact = 1;
        // for(int i=num1; i>=1;i--){
        //     fact *= i;
        // }
        // System.out.println(fact);

        // Using While Loop
        int i =1;
        while(i<=num1){
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}
