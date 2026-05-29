package DSA_mqt.Arrays.LeetCode_Questions;

public class MaxSumOfSubArray_53 {
      static int maxSum(int[] arr){
        int max = arr[0];
        int current = 0;
        for(int i=0;i<arr.length;i++){
            current += arr[i];
            if(current>max){
                max=current;
            }
            if(current<0){      // As if current becomes negative it will anyway reduce the sum from next items.
                current=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSum(arr);
        System.out.println(ans);
    }
}
