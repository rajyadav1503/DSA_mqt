package DSA_mqt.Arrays.LeetCode_Questions;

public class CountOfMatches1688 {
      public int numberOfMatches(int n) {
        int totalMatches = 0;
        int teamsAdvance = n;
        while(teamsAdvance>=2){
            if(teamsAdvance%2==0){
                int matches = teamsAdvance / 2;
                teamsAdvance = teamsAdvance/2;
                totalMatches += matches;
            }else{
                int matches = (teamsAdvance-1)/2;
                teamsAdvance = (teamsAdvance-1) / 2+ 1;
                totalMatches += matches;
            }
        }
        return totalMatches;
    }
}
