package DSA_mqt.Arrays.GeeksForGeeksQuestions;

import java.util.Arrays;

public class SwapArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        swap(arr,1,5);   // Swap values at particular index .
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int n,int m){
        int temp = arr[n];
        arr[n]=arr[m];
        arr[m]=temp;
    }
    
}
