package DSA_mqt.Arrays.TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // two sum problem    
    // this has Time complexity O(n2);
    public static int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];     // to store the index value ;
        for(int i=0;i<nums.length;i++){     
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }

    // We can optimize it using the hashmap;

    public static int[] twoSum2(int[] nums, int target) {
        // using hashmap
        int[] arr=new int[2];     // to store the index value ;
        //create hashmap;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){   
            int lookingFor = target - nums[i];  
            if(map.containsKey(lookingFor)){
                return new int[]{i , map.get(lookingFor)};  // here index is stored as the value and the number as key.
            }
            // if its not there , then store the nums[i] with its index in the HashMap;
            map.put(nums[i] , i);   // here index is stored as the value and the number as key.

        }
        return new int[]{-1,-1};   // if not found return -1 -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(arr,target)));

        System.out.println(Arrays.toString(twoSum2(arr, target)));
    }
    
}
