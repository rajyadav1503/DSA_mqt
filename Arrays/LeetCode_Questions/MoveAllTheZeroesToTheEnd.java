package DSA_mqt.Arrays.LeetCode_Questions;

import java.util.Arrays;

public class MoveAllTheZeroesToTheEnd {

    public static void moveZeroesToEnd(int[] arr ){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                int j = i+1;
                while(j<arr.length){
                    if(arr[j] !=0){
                        arr[i]=arr[j];
                        arr[j]=0;
                        break;
                    }
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,5,2,0,1,2};
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
