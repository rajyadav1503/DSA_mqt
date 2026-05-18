package DSA_mqt;

import java.util.Scanner;

public class ReversseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int reversed = 0;
      
        while(num1 !=0){
            int digit = num1%10;
            reversed = reversed*10 + digit;
            num1 /=10;

        }
        System.out.println(reversed);
        

    }
}
