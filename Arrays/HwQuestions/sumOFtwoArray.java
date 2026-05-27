package DSA_mqt.Arrays.HwQuestions;

import java.util.Arrays;

public class sumOFtwoArray {
      static int[] sum(int[] arr1,int[] arr2){
        int[] res= new int[arr1.length];
        for(int i=0;i< arr1.length;i++){
            res[i] = arr1[i] + arr2[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,4};
        String ans = Arrays.toString(sum(arr1,arr2));
        System.out.println(ans);

    }
}
