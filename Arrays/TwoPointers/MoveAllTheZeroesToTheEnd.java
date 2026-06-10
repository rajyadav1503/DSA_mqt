package DSA_mqt.Arrays.TwoPointers;

import java.util.Arrays;

public class MoveAllTheZeroesToTheEnd {

    public static void moveZeroesToEnd(int[] arr ){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                int j = i+1;
                while(j<arr.length){    // if i==0 , it checks for the next non-zero element after i .
                    if(arr[j] !=0){
                        arr[i]=arr[j];   // if non-zero elemnt found , it i is assigned to that non-zer value and 0 is assigned in place of that non-zero element.
                        arr[j]=0;
                        break;          // However this takes O(n2) 
                    }
                    j++;
                }
            }
        }
    }

    // Other method by creating a temp array;
    public void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int tempIndex = 0;
        for(int i=0;i<nums.length;i++){      // store all the non-zero to the starting of temp array
            if(nums[i] != 0){
                temp[tempIndex]=nums[i];
                tempIndex++;
            }
        }
        for(int i=tempIndex;i<temp.length;i++){    // assign all other elements at the last eith 0.
            temp[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
    }

    // Another method using count variable.
    public void moveZeroes1(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        for(int i=count;i<nums.length;i++){
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,0,5,2,0,1,2};
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
