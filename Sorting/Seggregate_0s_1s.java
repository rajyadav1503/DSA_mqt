package DSA_mqt.Sorting;

import java.util.Arrays;

public class Seggregate_0s_1s {
    
    public static void seggregtae(int[] arr){
        int n = arr.length;
        int i=0;
        int j=n-1;
        
        while(i<=n-1 && j>=0 && i<j){
            if(arr[i]==0 && arr[j]==0){
                
                i++;
            }else if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }else if(arr[i]==0 && arr[j]==1){
                i++;
            }else{
                j--;
            }
            
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,1,1,1,0};
        seggregtae(arr);
        
        System.out.println(Arrays.toString(arr));
    }

}
