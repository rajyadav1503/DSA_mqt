package DSA_mqt.Arrays.HwQuestions;

import java.util.Scanner;

public class SubtractTwoArrayWithBorrow {
     static int[] subtract(int n,int[] arr1,int m,int[]arr2){
        //Here We assume that arr1 >= arr2
        int[] res = new int[n];
        int i=n-1;
        int j=m-1;
        int k = res.length - 1;
        int borrow = 0;
        while(i>=0){
            int digit1 = arr1[i] - borrow;
            int digit2 = 0;
            if(j>=0) digit2 = arr2[j];
            if(digit1 < digit2){
                digit1 += 10;
                borrow = 1;
            }else{
                borrow = 0;
            }
            res[k]=digit1-digit2;
            i--;
            j--;
            k--;

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        int[] ans = subtract(n,arr1,m,arr2);
        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
