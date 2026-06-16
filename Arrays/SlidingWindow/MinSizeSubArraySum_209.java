package DSA_mqt.Arrays.SlidingWindow;

public class MinSizeSubArraySum_209 {

    // to find min length sub-array with sum >= target.
    
    //Brute-force soln  
    // TLE Occurs
    public static  int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum >= target){
                    minSize = Math.min(minSize , j-i+1);
                    break;
                }
            }
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }



    // Using Sliding Window
        public static  int minSubArrayLen2(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum = 0;

        //First making a window with sum >= target .
        //then moving th j forward and subtracting the ith elemnet and moving forward the i.
       
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                minSize = Math.min(minSize , j-i+1);
                sum -= nums[i];   // removing the elemnt from the left 
                i++;              // moving i forward.
            }
            j++;  // movenig j froward.
        }

        return minSize == Integer.MAX_VALUE ? 0 : minSize;    // minSize is Integer.MAX_VALUE ie no subarray with sum >= target , then return 0.

    }
    
}
