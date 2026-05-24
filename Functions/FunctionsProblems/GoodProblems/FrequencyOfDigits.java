package DSA_mqt.Functions.FunctionsProblems.GoodProblems;

public class FrequencyOfDigits {
    static int freq(int n,int d){
        int temp = n;
        int count = 0;
        while(n!=0){
            int rem = n%10;
            n/=10;
            if(rem==d){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int ans = freq(124224,2);
        System.out.println(ans);
    }
}
