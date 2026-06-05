package DSA_mqt.Arrays.LeetCode_Questions;

public class smallestIndexWithDigitSumEqualToIndex_3550 {
    public static int smallestIndex(int[] nums) {
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

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,10,14,16};
        int ans = smallestIndex(arr);
        System.out.println(ans);
    }
}
