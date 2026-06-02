package DSA_mqt.Arrays.GeeksForGeeksQuestions;

import java.util.Arrays;

public class RotateArray {

    // rotate an array by d places to the left
    // Example : rotate the array {1,2,3,4,5} by 2 places the it becomes {3,4,5,1,2}
    // Trick : First reverse the starting d elements , then reverse the elements from d to last index .
    // Then reverse the whole array
    static void rotateArr(int arr[], int d) {
        int left = 0;
        int right = d-1 ;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        int left2 = d;
        int right2= arr.length-1;
        while(left2<right2){
            int temp = arr[left2];
            arr[left2]=arr[right2];
            arr[right2]=temp;
            left2++;
            right2--;
        }
        int left3 = 0;
        int right3 = arr.length-1;
        while(left3<right3){
            int temp = arr[left3];
            arr[left3]=arr[right3];
            arr[right3]=temp;
            left3++;
            right3--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int rotate_value = 3;
        rotateArr(arr, rotate_value);
        System.out.println(Arrays.toString(arr));
    }
}
