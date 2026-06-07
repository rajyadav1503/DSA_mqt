package DSA_mqt.Arrays.LeetCode_Questions;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i=0;i<temp.length;i++){      // First square the each element in array
            temp[i]=nums[i]*nums[i];
        }
        for(int i=0;i<temp.length-1;i++){         // putting the squares in ascending order 
            for(int j=i+1;j<temp.length;j++){
                if(temp[j]<temp[i]){
                    int tempval=temp[i];
                    temp[i]=temp[j];
                    temp[j]=tempval;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    
}
