package DSA_mqt.Arrays.LeetCode_Questions;

public class LongestSubStringWithoutRepeatingChar_3 {
    public static int lengthOfLongestSubstring(String s) {

    // It is a Brute Force approach , not an optimal sol.
        int maxCount = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                char currentChar = s.charAt(j);
                boolean isSame = false;
                for(int k=i;k<j;k++){
                    if(s.charAt(k)==currentChar){
                        isSame = true;
                    }
                }
                if(!isSame){
                    maxCount = Math.max(maxCount,j-i+1);
                }else{
                    break;
                }
            }
        }
        return maxCount;

    }

    public static void main(String[] args) {
        String s = "abcabcbbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}
