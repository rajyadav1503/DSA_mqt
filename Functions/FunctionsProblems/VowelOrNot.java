package DSA_mqt.Functions.FunctionsProblems;

import java.util.Scanner;

public class VowelOrNot {

    // static boolean isVowel(char a){
    //     if(a=='a'|| a=='e'|| a=='i'|| a=='o'|| a=='u' || a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
    //         return true;
    //     }
    //     return false;
    // }

        // Or method : by taking a variable inside funiction.

    static boolean isVowel(char a){
        boolean isvowel = false;
        if(a=='a'|| a=='e'|| a=='i'|| a=='o'|| a=='u' || a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            isvowel=true;
        }
        return isvowel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(isVowel(a)){
            System.out.println("Yes a vowel");
        }else{
            System.out.println("Not a vowel");
        }

    }
    
}
