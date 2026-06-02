package DSA_mqt.Arrays.GeeksForGeeksQuestions;

import java.util.Arrays;

public class RotateArray {

        // if rotate an array to left by just 1 time.
    static void rotateBy1(int[] arr){
        int temp = arr[0];    //Store the first element in temp , then bring the other elements forward by one place , then add tep in the last.
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

    }

    //IF rotate by d places to the left .
    static void rotateBy_d(int[] arr , int d){
        int[] temp = new int[d];
        for(int i=0;i<d;i++){      //Storing starting d elements in temp array;
            temp[i]=arr[i];
        }
        for(int i=d;i<arr.length;i++){   //Bring the last elements after d towards the first.
            arr[i-d]=arr[i];
        }
        for(int i=arr.length-d;i<arr.length;i++){    // Add the temp array at the last .
            arr[i] = temp[i-(arr.length-d)];
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int rotate_value = 3;

        rotateBy_d(arr,rotate_value);
        System.out.println(Arrays.toString(arr));     // Array will be rotated by towards left. // [4,5,1,2,3]
    }
}
   
