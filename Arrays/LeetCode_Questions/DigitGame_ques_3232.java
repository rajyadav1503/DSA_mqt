package DSA_mqt.Arrays.LeetCode_Questions;

public class DigitGame_ques_3232 {

//You are given an array of positive integers nums.

// Alice and Bob are playing a game. In the game, Alice can choose either all single-digit numbers or all double-digit numbers from nums, and the rest of the numbers are given to Bob. Alice wins if the sum of her numbers is strictly greater than the sum of Bob's numbers.

// Return true if Alice can win this game, otherwise, return false.

    static boolean canAliceWin(int[] nums) {
        int singleDigit = 0;
        int doubleDigit = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 10){
                singleDigit += nums[i];
            }else{
                doubleDigit += nums[i];
            }
        }
        return singleDigit != doubleDigit;      //IF sum of singleDigit is equal to sum of DoubleDigit , then Alice looses.
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10};
        System.out.println(canAliceWin(arr));

    }
    
}
