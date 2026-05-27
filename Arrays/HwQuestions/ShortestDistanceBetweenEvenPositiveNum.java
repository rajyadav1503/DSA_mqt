package DSA_mqt.Arrays.HwQuestions;

public class ShortestDistanceBetweenEvenPositiveNum {
       static int shortest(int[] arr){

        int firstEven = 0;
        int secondEven = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                firstEven += i;
                break;
            }

        }
        for(int i=firstEven+1;i<arr.length;i++){
            if(arr[i]%2==0){
                secondEven += i;
                break;
            }
        }
        int dist = secondEven - firstEven;
        if(dist==0 || secondEven==0) return -1;
        return dist;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,6,9};
        int ans1 = shortest(arr);
        System.out.println(ans1);

        int[] arr2 = {1,2,3,5,7,3,9};
        int ans2 = shortest(arr2);
        System.out.println(ans2);
    }
    
}
