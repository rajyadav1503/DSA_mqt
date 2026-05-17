package DSA_mqt;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in celcius: ");
        float cel = sc.nextFloat();
        float farenhite = (cel * 9/5) + 32;
        System.out.print("Temp in farenhite: ");
        System.out.println(farenhite);

        sc.close();
    }
}
