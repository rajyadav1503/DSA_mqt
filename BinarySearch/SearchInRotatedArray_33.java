package DSA_mqt.BinarySearch;

public class SearchInRotatedArray_33{
    public static int search(int[] nums, int target) {

        //This ques requires o(log n ) time complexity , so we can not just sort it and use linear search.
        // Arrays.sort(nums);

        //we can use binary search as in rotated sorted array , atleast one half is always sorted and other half is unsorted.

        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left  + (right-left)/2;
            if(nums[mid]==target) return mid;

            if(nums[left] <= nums[mid]){   // check if array is sorted towards left.

                //find in left sorted array.
                if(target>=nums[left] && target < nums[mid] ) right=mid-1;
                else left = mid+1;

            }else{
                //find in right array .
                if(target > nums[mid] && target <=nums[right]) left= mid+1;
                else right = mid -1;
            }
        }
        return -1;
    }
    
}
