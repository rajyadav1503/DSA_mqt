package DSA_mqt.Arrays.SlidingWindow;

public class MaxAvgSubarray_643 {

    //Brute Force approach;
    // TLE in leetcode

    public static double findMaxAverage(int[] nums, int k) {
        double highestAVG = 0;
        for(int i=0;i<=nums.length - k ;i++){
            int j = i;
            int sum = 0;
            while(j<=j+k-1){
                sum += nums[j];
                j++;
            }
            double currentAVG = sum / k;
            highestAVG = Math.max(currentAVG , highestAVG);
        }
        return highestAVG;
    }


    // By Sliding Window

    public static double findMaxAvg(int[] nums,int k){
        double maxSum = 0;
        for(int i=0;i<k;i++){
            maxSum += nums[i]; 
        }
        double maxAVG = maxSum / k;

        for(int i=k;i<nums.length;i++){
            maxSum += nums[i];
            maxSum -= nums[i-k];
            double currentAVG = maxSum/k;

            maxAVG = Math.max(maxAVG,currentAVG);
        
        }
        return maxAVG;
    }

    

    
}
