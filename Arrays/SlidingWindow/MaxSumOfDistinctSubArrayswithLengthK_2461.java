package DSA_mqt.Arrays.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaxSumOfDistinctSubArrayswithLengthK_2461 {

    // brute force approach

    //TLE OCCURS 

         public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long maxSum = 0;
        int n=nums.length;
        //[1,2,3,4,4] k=2;
        for(int i=0;i<=n-k;i++){
            Set<Integer> set = new HashSet<>();
            boolean isValid = true;
            sum = 0;
            for(int j=i;j<=i+k-1;j++){
                if(set.contains(nums[j])){
                    isValid = false;
                    break;
                }
                set.add(nums[j]);
                sum += nums[j];   
            }
            if(isValid){
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }


    // Using Map;
    public long maximumSubarraySum(int[] nums, int k) {
       long maxSum = 0;
       long sum = 0;
       Map<Integer,Integer> map = new HashMap<>();
       boolean isSame=false;
       int duplicate = 0;
       for(int i=0;i<k;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i] , 0);
            }
            map.put(nums[i] , map.get(nums[i])+1);
            sum += nums[i];
            if(map.get(nums[i]) > 1){
                duplicate += 1;
            }
        }
        if(duplicate==0){
            maxSum=Math.max(maxSum,sum);
        }

        for(int i=k; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            map.put(nums[i],map.get(nums[i]) + 1);

            if(map.get(nums[i]) > 1){
                duplicate += 1;
            }

            sum += nums[i];

            if(map.get(nums[i-k]) > 1){
                duplicate -= 1;
            }

            map.put(nums[i-k] , map.get(nums[i-k]) - 1);
            sum -= nums[i-k];

            if(duplicate == 0){
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}

