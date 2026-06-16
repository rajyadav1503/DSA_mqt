package DSA_mqt.Arrays.SlidingWindow;

public class ContainsDuplicateII_219 {

    //brute force 
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    int absDiff = Math.abs(i-j);
                    if(absDiff <= k) return true;
                }
                
            }
        }
        return false;
    }
    
}
