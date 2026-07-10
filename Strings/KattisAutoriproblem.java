package DSA_mqt.Strings;

import java.util.Scanner;

public class KattisAutoriproblem {

    public static String shortForm(String s){
        int n = s.length();
        
        int count = 1;
        
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '-'){
                count++;
            }
        }
        char[] ans = new char[count];
        int j = 0;
        ans[j]=(s.charAt(0));
        j++;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '-'){
                ans[j] = s.charAt(i+1);
                j++;
            }
        }
        
        return new String(ans);
        
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        
        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            
            System.out.println(shortForm(input));
        }
        
        sc.close();
    }
    
}
