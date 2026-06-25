package DSA_mqt.BinarySearch;

public class minPAGES_GFG {

      public int findPages(int[] arr, int k) {
        // 
        
        if (k > arr.length) {
            return -1;
        }
        
        int sum = 0;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            max = Math.max(max,arr[i]);
        }
        
        int left = max;
        int right = sum;
        int ans = -1;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            if(isPossible(arr , k , mid)){
                ans = mid ;
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return ans ;
        
    }
    
    public static boolean isPossible(int[] arr , int k, int maxPagesAllowed){
            int students = 1;
            int currentPages = 0;
            
            for(int pages : arr){
                if(currentPages+pages <= maxPagesAllowed){
                    currentPages += pages;
                }else{
                    students++;
                    currentPages = pages;
                }
            }
            
            return students<=k;
        }
    
}
