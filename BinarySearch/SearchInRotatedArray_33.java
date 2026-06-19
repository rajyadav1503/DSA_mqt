package DSA_mqt.BinarySearch;

public class SearchInRotatedArray_33-leetcode {
       public int search(int[] nums, int target) {
        // Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left  + (right-left)/2;
            if(nums[mid]==target) return mid;

            if(nums[left] <= nums[mid]){
                if(target>=nums[left] && target < nums[mid] ) right=mid-1;
                else left = mid+1;

            }else{
                if(target > nums[mid] && target <=nums[right]) left= mid+1;
                else right = mid -1;
            }
        }
        return -1;
    }
    
}
