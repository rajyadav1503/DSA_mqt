package DSA_mqt.Arrays.TwoPointers;

public class RotateByLeft {
      static void rotateArr(int[] arr, int d) {
        // code here
        int left = 0;
        int right = d - 1;
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
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = {1,2,3,4,5};
        rotateArr(arr,2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
