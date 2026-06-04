package DSA_mqt.Arrays.LeetCode_Questions;

public class RemoveDuplicateElements {

    public static int totalDuplicates(int[] arr){
        int unique = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[unique]){
                unique++;
                arr[unique] = arr[i];
            }
        }
        return unique + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int ans = totalDuplicates(arr);
        System.out.println(ans);  

    }
    
}
