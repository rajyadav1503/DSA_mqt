package DSA_mqt.Arrays.LeetCode_Questions;

public class DigitEqualToIndex_ques3550 {
    
    // to find a smallest index in the array at which the value of sum of digits of the number is equal to the index .
    public static void main(String[] args) {
        int[] arr1 = {1,3,2};    // here at index 2 , the sum of digits is 2
        int[] arr2 = {1,10,11};  // here at index 1 , the sum of digits is 1+0 = 1;
        System.out.println(smallestIndex(arr1));
        System.out.println(smallestIndex(arr2));
    }

    static int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                if(nums[i]==i) return i;
            }else{
                int sum=0;
                while(nums[i]!=0){
                    int rem = nums[i]%10;
                    sum+=rem;
                    nums[i] /= 10;
                }
                if(sum==i) return i;
            }
        }
        return -1;
    }
}
