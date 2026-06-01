package DSA_mqt.Arrays.GeeksForGeeksQuestions;

// k = total minutes
// Input: k = 10, arr1 = [3, 4, 5], arr2 = [4, 4, 5]
// Output: 12
// Explanation: If Geek picks book of first kind he can read it 3 times, 
// he will get 3*4 = 12 points. If Geek picks book of second kind he can read it 2 times,
//  he will 2*4 = 8 points. If Geek picks book of third kind he can read it 2 times, he will get 2*5 = 10 points. 
//  So the maximum possible points which he can earn in those 10 minutes is 12.

public class ReadingBooks {

    static int maxPoint(int k, int[] arr1, int[] arr2) {
        
        int maxPoints = 0;
        for(int i=0;i<arr1.length;i++){
            int time = k / arr1[i];
            int points = time * arr2[i];
            if(points > maxPoints) maxPoints = points;
        }
        return maxPoints;
    }
   
    public static void main(String[] args) {
         int[] arr1 = {3,4,5};
        int[] arr2 = {4,4,5};
        int k = 10;
        System.out.println(maxPoint(k, arr1, arr2));
    }

    
}
