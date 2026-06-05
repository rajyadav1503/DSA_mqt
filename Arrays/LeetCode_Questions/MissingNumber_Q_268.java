package DSA_mqt.Arrays.LeetCode_Questions;

public class MissingNumber_Q_268 {
    public static void main(String[] args) {
        int[] arr={3,0,1};   //2 is missing
        System.out.println(missing(arr));

        int[] arr2={1,1,0,2};  // 3 and 4 is missing
        missigNumbers(arr2);
    }
    static int missing(int[] arr){
        int maxSum = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            maxSum += i+1;
            sum += arr[i];
        }
        return maxSum - sum;
    }


    // Print the missing numbers 

    static void missigNumbers(int[] arr){
        int[] temp = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }
        for(int i=1;i<temp.length;i++){
            if(temp[i]==0){
                System.out.print(i+" ");
            }
        }
    }

    //Return count of all the digits 
    // return the missing numbers
    // return the count of missing numbers 
}
