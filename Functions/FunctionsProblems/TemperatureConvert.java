package DSA_mqt.Functions.FunctionsProblems;

import java.util.Scanner;

public class TemperatureConvert {

    public static double convert(float c){
        return c*9/5 + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter celcius");
        float cel = sc.nextFloat();
        System.out.println(convert(cel));

    }
}
