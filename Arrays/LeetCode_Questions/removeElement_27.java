package DSA_mqt.Arrays.LeetCode_Questions;

public class removeElement_27 {

    // remove all the elements which are equal to the given val;
    // count these elements
    //move other elements to the front of array.
       public static int removeElement(int[] nums, int val) {
        int index=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                count++;
                nums[index]=nums[i];
                index++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,1,2};
        int ans = removeElement(arr, 2);
        System.out.println(ans);
    }
}
