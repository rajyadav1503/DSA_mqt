public class MissingNumber_Q_268 {
    public static void main(String[] args) {
        int[] arr={3,0,1};   //2 is missing
        int[] arr2={1,4,0,2};  // 3is missing
        System.out.println(missing(arr));
        System.out.println(missing(arr2));
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
}
