package DSA_mqt.Arrays.LeetCode_Questions;

public class LargestNumAtleastTwiceOfOthers_747 {

    // in the given array the largest number should be atleast twice as big as other numbers in the array.
    // ex {3,6,1,0}  return the index value with largest number which satisfies the above criteria
    // Otherwise return -1;

    public static  int dominantIndex(int[] nums) {
        int largest = nums[0];
        int largestIndex = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                largest = nums[i];
                largestIndex = i;
                
            } 
        }
        int count = 0;
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]<=largest / 2){
                count++;
            }
        }
        if(count == nums.length - 1) return largestIndex;
        return -1;
        
    }
    public static void main(String[] args) {
        int[] arr = {3,6,1,0};      //index 1 has largest number and satisfies the condition.
        int ans = dominantIndex(arr);
        System.out.println(ans);
    }


    
}
