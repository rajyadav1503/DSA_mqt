package DSA_mqt.Arrays.TwoPointers;

public class ValidPalindromeII_680 {
    // A string is a valid palindrome if after reoving at most 1 element , it is a palindrome.

    public static boolean PalindromeCheck(int i,int j,String s){
       while(i<j){
         if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        i++;
        j--;
       }
       return true;
    }

    //ex:   abbxa
    // we can delete eny character only one time .
    // so we can either delete i or j ; and check if after deleting either i or j it still is a palindrome.
    // either do i+1 or j-1 and then check for palindrome for both cases 
    // if any case results in palindrome in further check , then it is a valid palindrome.

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j= s.length()-1;
        while(i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(left!=right){
                return (PalindromeCheck(i+1, j, s) || PalindromeCheck(i, j-1, s));
            }else{
                i++;
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abbxa";
        System.out.println(validPalindrome(s));
    }
}
