package DSA_mqt.Strings;

public class MaxFreqOfCharacters {

     public static char getMaxOccuringChar(String s) {
        // code here
        int n = s.length();
        int[] freq = new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        
        int max = freq[0];
        int maxfreq = 0;
        for(int i=0;i<26;i++){
            if(freq[i]> max ){
                max = freq[i];
                maxfreq = i;
            }
        }
        
        char ans = (char) ( maxfreq + 'a' );
        return ans;
        
    }
    
}
