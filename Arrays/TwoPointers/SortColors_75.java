package DSA_mqt.Arrays.TwoPointers;

import java.util.Arrays;

public class SortColors_75 {

    public static void sortColors(int[] nums) {
        int[] ans = new int[nums.length];    // create a new array to store the correct answer.
        // start storing 0 from the start and 2 from the end 
        int a=0;   // Put a in the start index .
        int b=nums.length-1;   // put b in the last index .

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                    // a=i;
                    ans[a]=nums[i];     //store 0 from start.
                    a++;
                }
            if(nums[i]==2){
                    // b=i;
                    ans[b]=nums[i];      //store 2 from end.
                    b--;
                }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ans[a]=nums[i];        //store 1 after 0.
                a++;
            }
        }

        for(int i=0;i<nums.length;i++){      // copy the ans array to the nums arrray.
            nums[i]=ans[i];
        }
    }

    // to reduce space complexity

    public void sortColors2(int[] nums) {
        // store the counts of 0s 1s and 2s.
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }else if(nums[i]==1){
                count1++;
            }else{
                count2++;
            }
        }

        //replacing the original array by using the count values.
        int i=0;
        while(count0>0){
            nums[i]=0;
            i++;
            count0--;
        }
        while(count1>0){
            nums[i]=1;
            i++;
            count1--;
        }while(count2>0){
            nums[i]=2;
            i++;
            count2--;
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));    // output [0,0,1,1,2,2]
    }  
    
}
