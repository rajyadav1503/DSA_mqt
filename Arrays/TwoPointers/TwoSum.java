package DSA_mqt.Arrays.TwoPointers;

import java.util.Arrays;

public class TwoSum {
    // two sum problem
      public static int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];     // to store the index value ;
        for(int i=0;i<nums.length;i++){     
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    
}
