package DSA_mqt.Sorting.Bubble_Sort;

import java.util.Arrays;

public class basic {

     public static void bubbleSort(int[] arr) {
        // code here
        int n= arr.length;
       for(int i=0;i<n-1 ; i++){
           
           boolean isSwapped = false;   // to exit the outer i loop if elements got sorted already .
           
           for(int j=0;j<n-i-1 ; j++){   // swapping the elements.
               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   
                   isSwapped = true;  // if swapping happend .
               }
               
           }
           
           if(!isSwapped){   // this tells if the array is now already sorted 
               break;
           }
       }
        
    }

    public static void main(String[] args) {
        int[] arr = {4,1,3,9,7,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
