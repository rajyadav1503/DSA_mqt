package DSA_mqt.Arrays.GeeksForGeeksQuestions;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    static void pushZerosToEnd(int[] arr) {
        
        int[] temp = new int[arr.length];
        int tempIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[tempIndex]=arr[i];
                tempIndex++;
            }
        }
        for(int i=tempIndex+1;i<temp.length;i++){
            temp[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        
    }

    public static void main(String[] args) {
        int[] arr={12,0,9,0,0,4,5,6,0};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
