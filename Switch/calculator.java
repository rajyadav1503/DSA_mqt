package DSA_mqt.Switch;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b = sc.nextInt();
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '-':
                System.out.println(a-b);
                break;
            case '+':
                System.out.println(a+b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b !=0)
                    System.out.println(a/b);
                else System.out.println("Cannot divide by 0");
                break;
            case '%':
                if(b !=0)
                    System.out.println(a%b);
                else System.out.println("Cannot divide by 0");
                break;
            default:
                System.out.println("Invalid Choice");

        }
        sc.close();

    }
}
