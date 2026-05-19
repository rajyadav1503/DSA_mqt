package DSA_mqt.Loops;

import java.util.*;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 80;
        // int startlimit = (int) (Math.sqrt(20) + 1); // as we have tp find b/w 20 and 80
        // int count = 0;
        // for(int i=startlimit;(i*i)<num1;i++){
        //     int temp = i*i;
        //     count++;
        //      System.out.println(temp);
        // }
        // System.out.println("Total perfect squares : " + count);

        // Perfect cubes b/w 20 and 80
        for(int i=1;i<=80;i++){
            if(i*i*i >=20  && i*i*i <=num1){
                System.out.println(i*i*i);
            }
        }
       
    }
}
