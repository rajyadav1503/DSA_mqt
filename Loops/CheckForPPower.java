package DSA_mqt.Loops;

import java.util.Scanner;

public class CheckForPPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();   //This should be smaller no.
        int num2 = sc.nextInt();   // This should be greater no.
        

        while(num2%num1==0){
            num2 = num2 / num1;
        }
        if(num2 == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
