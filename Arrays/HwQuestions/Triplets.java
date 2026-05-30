package DSA_mqt.Arrays.HwQuestions;
public class Triplets {
     // Given a sorted array we have to find a triplet which is in geometric progresion;
    //
     // The idea is to start from the second element and fix every element as middle element and search for the other two elements in a triplet (one smaller and one greater).
    // For an element arr[j] to be middle of geometric progression, there must exist elements arr[i] and arr[k] such that - the ration of j/i and k/j must be same .

    static void findTriplet(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j] % arr[i] == 0){
                    int x = arr[j] / arr[i];

                    for(int k=j+1;k<arr.length;k++){
                        if(arr[k] % arr[j] == 0 && arr[k] / arr[j] == x){
                            System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                            
                        }
                    }
                }
              
            }
        }
    }

    // static void findTriplet(int[] arr){
    //     int n = arr.length;
    //     for(int j=1;j<n-1;j++){
    //         int i=j-1;
    //         int k = j+1;
    //         while(i>=0 && k<n){
    //             long leftVal = arr[i];
    //             long midVal = arr[j];
    //             long rightVal = arr[k];
    //             //As the array is sorted

    //             if (midVal * midVal == leftVal * rightVal){
    //                 if(rightVal % leftVal == 0 ){   //Some other fraction can also satisfy j*j , example {4,6,9};
    //                     System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
    //                 }
    //                 i--;
    //                 k++;
    //             }
    //             else if (midVal * midVal > leftVal * rightVal){
    //                 k++;
    //             }else{
    //                 i--;
    //             }
    //         }
    //     }
    // }

    public static void main(String[] args) {
       
        int[] arr = {1,2,6,10,18,54};
       
        findTriplet(arr);
    }
}
