package DSA_mqt.Arrays.HwQuestions;

import java.util.Scanner;

public class CountElementsLessThanX {
      static int count(int[] arr){
        int count = 0;
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<largest) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans = count(arr);
        System.out.println(ans);
    }
}
