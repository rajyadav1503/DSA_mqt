package DSA_mqt.Arrays.HwQuestions;

public class MaxDistBetweenSameNumber {
      static int maxDistance(int[] arr){
        int max = 0;
        for(int i=0;i< arr.length;i++){
            for(int j= arr.length-1;j>i;j--){
                if(arr[i]==arr[j]){
                    int distance = j-i;
                    if(distance > max){
                        max = distance;
                    }
                    break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,6,2,3,2,4};
        int ans = maxDistance(arr);
        System.out.println(ans);

    }
    
}
