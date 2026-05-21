package DSA_mqt.Loops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int firstNum = 0;
        int secondNum = 1;

        for(int i=1;i<=num1;i++){
            System.out.println(firstNum);
            int nextNum = firstNum+secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
