package DSA_mqt.Arrays.HwQuestions;

import java.util.Scanner;

public class SumOfArrayExceptItself {
    static void sumArray(int[] arr) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=sum - arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sumArray(arr);

    }
}
