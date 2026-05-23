package DSA_mqt.Functions.FunctionsProblems;

import java.util.Scanner;

public class TableOfNumber {
    static void Table(int n){
        for(int i=1;i<=10;i++){
            System.out.print(n + " * " + i + " = ");
            int result = n*i;
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        Table(num1);
    }
    
}
