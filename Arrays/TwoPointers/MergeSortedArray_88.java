package DSA_mqt.Arrays.TwoPointers;

import java.util.Arrays;

public class MergeSortedArray_88 {

//Given two array nums1 and nums2 wihch is non-decreasing order ;
// and m and n represeneting the no of elements in nums1 and nums2
// the nums1 array has m elements + n '0' elements so when we merge the two arrays the n elements can be added in the nums1 array;
// we have to merge nums1 and nums2 in nums1 array;
// m + n = nums1.length;

// Eg.   nums1 = {1,2,3,0,0,0};
//       nums2 = {2,5,6};

//       output = {1,2,2,3,5,6};

    public static int[] MergeArray(int[] nums1 , int m, int[] nums2,int n){
        int i=m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>=0){     // here we cannot write while(k>=0) because if nums2 elements gtes empty first ie. if j becomes -1 first the loop will still check for j 
                         // which will give outofboundexception.

            if(i>=0 && nums1[i]>nums2[j]){   // here i>=0 condn is must as if we don't use this and i becomes -1 before j than it still checks for i which will give outof bound exception.
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        String ans = Arrays.toString(MergeArray(arr1, 3, arr2, 3));
        System.out.println(ans);

    }
    
}
