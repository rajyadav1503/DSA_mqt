package DSA_mqt.Functions.FunctionsProblems;

import java.util.Scanner;

public class AreaOfCircle {

    public static float Area(int radius){
        return (float)(3.14 *radius*radius);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();    //Taking input as int and returning float value.
        float area = Area(rad);
        System.out.println(area);
    }
}
