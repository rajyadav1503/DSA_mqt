package DSA_mqt.Arrays.LeetCode_Questions;

public class LongestSubarrayFromAString {
    // Sliding Window Question

    //This is a bruteForce Approach
    static int longest(String s){
        int maxLength = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                char currentChar = s.charAt(j);
                boolean isSame = false;
                for(int k=i;k<j;k++){       // This k loop is to compare the characters before current character if it is same or not.
                                            // This will not run for the first character as k<j would not satisfy.
                    if(s.charAt(k)==currentChar){
                        isSame = true;
                    }
                }
                if(!isSame){
                    maxLength=Math.max(maxLength, j-i+1);
                }else{
                    break;
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "a,b,c,a,b,c,a,a";
        int ans = longest(s);
        System.out.println(ans);
    }
}
