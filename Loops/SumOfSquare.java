package DSA_mqt.Loops;

import java.util.Scanner;

public class SumOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int sum =0;
        while(num1>0){
            int temp = num1 % 10;
            sum += (temp*temp);
            num1 /=10;
        }
        System.out.println(sum);
    }
}
