package DSA_mqt.Loops;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int sum = 0;
        int original = num1;
        while(num1!=0){
            int temp = num1 % 10;
            sum += temp*temp*temp;
            num1/=10;
        }
        if(sum == original){
            System.out.println("Yes it is an armstrong number");
        }else{
            System.out.println("Not an armstrong");
        }
    }
}
