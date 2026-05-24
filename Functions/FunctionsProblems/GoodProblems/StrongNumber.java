package DSA_mqt.Functions.FunctionsProblems.GoodProblems;

public class StrongNumber {
    
    // A number is strong if each digit's Factoral's sum is eqaul to that number.
    // Ex : 145 = 1! + 4! = 5!
    static boolean isStrong(int n){
        if(n==1 || n==2) return true;
        int sum = 0;
        int temp = n;
        while(n!=0){
            int rem = n%10;
            n /=10;
            int fact = 1;
            for(int i=1;i<=rem;i++){
                fact = fact * i;
            }
            sum += fact;
//            fact=1;    // No need of this as every time it enters while loop fact gets initialized with 1.
        }
        return sum == temp;

    }

    public static void main(String[] args) {
        boolean ans = isStrong(12);
        System.out.println(ans);
    }
}
