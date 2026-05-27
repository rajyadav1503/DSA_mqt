package DSA_mqt.Arrays.BasicsOfArray;

import java.util.Scanner;

public class Input {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Directly
//        arr[0]=21;
//        arr[1]=72;
//        arr[2]=13;
//        arr[3]=61;
//        arr[4]=25;

        // By using for loop  we can take input
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // We can print the values in array by for loop or by :-
        // By Enhanced for loop (for each loop) : This runs loop for every element in the array.

        for(int num:arr){     // Here num represents each element(the value at every index) of array.
            System.out.print(num + " ");   // Here we print num directly and not arr[num] because num is the value at every index.
        }


        // Or we can also print the values of array using stringBuilder class. (using Arrays.toString( arr ) method. )

        System.out.println(Arrays.toString(arr));    // converts the whole array into String and print it inside [] brackets with comma(,)

    }
}
