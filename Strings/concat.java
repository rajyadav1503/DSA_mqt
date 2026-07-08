package DSA_mqt.Strings;

public class concat {

    public static void main(String[] args) {
        String s = "Cat";
        System.out.println(s.length());

        String s1 = "Hello Iam Raj";

        int wordCount = 1;
        
        for(int i=0;i<s1.length();i++){
            //  boolean isWord = true;
            if(s1.charAt(i) == ' ' || s1.charAt(i) == '\t'){

                wordCount++;
            }
        }

        System.out.println(wordCount);
        
    }
    
}
