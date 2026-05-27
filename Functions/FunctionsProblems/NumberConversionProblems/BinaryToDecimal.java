package DSA_mqt.Functions.FunctionsProblems.NumberConversionProblems;

public class BinaryToDecimal {
     static int convert(int n){
        int res = 0;
        int power = 1;
        while(n!=0){
            int rem = n%10;
            n /= 10;
            int digit = rem * power;
            power *= 2;
            res = res + digit;
        }
        return res;
    }

    public static void main(String[] args) {
        int num1 = 1100100;
        int ans = convert(num1);
        System.out.println(ans);
    }

}
