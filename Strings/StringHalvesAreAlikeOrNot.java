package DSA_mqt.Strings;

public class StringHalvesAreAlikeOrNot {

    //Breute force :

      public boolean halvesAreAlike1(String s) {

        int n = s.length();
        for(int i=0;i<n;i++){
            Character.toLowerCase(s.charAt(i));
        }    

        int count1=0;
        int count2=0;    
        for(int i=0;i<n/2;i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ){
                count1++;
            }
        }

        for(int i=n/2;i<n;i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if( ch=='a' || ch =='e'|| ch =='i'|| ch =='o'|| ch =='u' ){
                count2++;
            }
        }

        if(count1==count2) return true;

        return false;
    }


    //More optimized :

    

    public boolean halvesAreAlike(String s) {

        int n = s.length();
        int mid = n/2;

        String vowels = "aeiouAEIOU";
        int count1=0;
        int count2=0;

        for(int i=0;i<mid;i++){
            if(vowels.indexOf(s.charAt(i)) != -1) count1++;

            if(vowels.indexOf(s.charAt(i+mid)) != -1) count2++;
        }

        return (count1 == count2);
    }
    
}
