package DSA_mqt.Functions.FunctionsProblems.GoodProblems;

public class fibonacci {

    static void fibonacci(int n){
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        for(int i=1;i<=n;i++){
            System.out.println(num1);
            sum = num1+num2;
            num1=num2;
            num2=sum;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
    
}
