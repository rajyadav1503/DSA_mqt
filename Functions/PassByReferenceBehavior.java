package DSA_mqt.Functions;

import java.util.Arrays;

public class PassByReferenceBehavior {
    
     static void change(int[] nums){
        nums[0]=99;  //Here change is made to the actual object refered by the variable arr
                     // which is also refferd by variable nums
                     // nums and arr refer to the same object , they point to the memory address of array.
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3};  // Java treats arrays as an object and arrays are hence stored on the heap.
                              // Here {1,2,3} is an object
        change(arr);  //reference to an object is passed 
                      // While java is strictly "Pass by value" and the value passed here is the memory address.
        System.out.println(Arrays.toString(arr));  // Prints [99 , 2, 3]
    }
}
