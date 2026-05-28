package DSA_mqt.Arrays.HwQuestions;

import java.util.Scanner;

public class Triplets {
     // Given a sorted array we have to find a triplet which is in geometric progresion;
    //
     // The idea is to start from the second element and fix every element as middle element and search for the other two elements in a triplet (one smaller and one greater).
    // For an element arr[j] to be middle of geometric progression, there must exist elements arr[i] and arr[k] such that -

    static void findTriplet(int[] arr){
        int n = arr.length;
        for(int j=1;j<n-2;j++){
            int i=j-1;
            int k = j+1;
            while(i>=0 && k<n){
                long leftVal = arr[i];
                long midVal = arr[j];
                long rightVal = arr[k];
                //As the array is sorted

                if (midVal * midVal == leftVal * rightVal){
                    if(j%i==0){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                    i--;
                    k++;
                }
                else if (midVal * midVal > leftVal * rightVal){
                    k++;
                }else{
                    i--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findTriplet(arr);
    }
}
