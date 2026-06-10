package DSA_mqt.Arrays.TwoPointers;

public class ValidWordAbbreviation {
    public static boolean isValidAbbreviation(String word,String abbr){
        int i=0;
        int j=0;
        while(i<word.length() && j<abbr.length()){
            char w = word.charAt(i);
            char a = abbr.charAt(j);
            if(Character.isDigit(a)){
                if(a=='0') return false;

                int sum = 0;
                while(j<abbr.length() && Character.isDigit(abbr.charAt(j))){
                    sum = sum * 10 + (abbr.charAt(j)-'0');
                    j++;
                }
                i = i+sum;
            }else{
                if(w!=a){
                    return false;
                }
                i++;
                j++;
            }

        }
        return i==word.length() && j==abbr.length();
    }

    public static void main(String[] args) {
        String word = "simulation";
        String abbr1 = "s8n";   // this is true abbreviation.
        String abbr2="s7n";  // this is wrong abbreviation 
        boolean ans1 = isValidAbbreviation(word, abbr1);
        boolean ans2 = isValidAbbreviation(word, abbr2);
        System.out.println(ans1);
        System.out.println(ans2);
    }   
}
