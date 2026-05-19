package DSA_mqt.Loops;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num1 = sc.nextInt();
        int sum = 0;
       while (num1!=0){
           sum += num1%10;
           num1 = num1/10;
       }
       System.out.print("The sum of Num is: ");
        System.out.println(sum);
    }
}
