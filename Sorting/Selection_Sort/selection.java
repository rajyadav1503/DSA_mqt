package DSA_mqt.Sorting.Selection_Sort;

import java.util.Arrays;

public class selection {

    public static void selectionSort(int[] arr){

        int n=arr.length;
        for(int i=0;i<n;i++){

            int smallest = arr[i];
            int smallestIndex = i;
            for(int j=i ; j<n;j++){
                if(arr[j] < smallest){
                    smallest=arr[j];
                    smallestIndex=j;
                    
                }
            }
            int temp = arr[i];
            arr[i]=smallest;
            arr[smallestIndex]=temp;
            
        }

    }

    public static void main(String[] args) {
        int[] arr = {65,32,33,22,50,11,0,17,7,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
