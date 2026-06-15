package DSA_mqt.Arrays.SlidingWindow;

import java.util.Arrays;

public class DefuseTheBomb_1652 {
    
    public static int[] decrypt(int[] code, int k) {
        int n = code.length;

        if(k>=0){
            int[] ans = new int[n + k];
            for(int i=0;i<n;i++){
                ans[i] = code[i];
            }
            for(int i=0;i<k;i++){
                ans[i+n] = code[i];
            }

            for(int i=0;i<code.length;i++){
                int sum = 0;
                for(int j=i+1;j<=i+k;j++){
                    sum += ans[j];
                }
                code[i]=sum;
            }

        }else {
            // k is negative. n - k means n + abs(k)
        int[] res = new int[n - k]; 
        int positiveK = -k; // Positive version of k for easier loop counting

        
        for (int i = 0; i < positiveK; i++) {
            res[i] = code[n - positiveK + i];
        }

        for (int i = 0; i < n; i++) {
            res[i + positiveK] = code[i];
        }

    
        for (int i = 0; i < n; i++) {
            int targetIndexInRes = i + positiveK;
            int sum = 0;
            
            // Collect the 'positiveK' elements directly to its left
            for (int j = targetIndexInRes - positiveK; j < targetIndexInRes; j++) {
                sum += res[j];
            }
            code[i] = sum; 
        }
        }
    
        return code;
    }


    public static void main(String[] args) {
        int[] arr = {2,4,9,3};
        int k = -2;
        System.out.println(Arrays.toString(decrypt(arr, k)));
    }
}
