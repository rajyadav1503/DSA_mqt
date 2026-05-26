package DSA_mqt.Functions.FunctionsProblems;

public class SumOfEvenNumbers {

    static int sumEven(int start , int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if( i%2==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int ans = sumEven(0, 10);
        System.out.println(ans);
    }
    
}
