package DSA_mqt.Functions.FunctionsProblems.NumberConversionProblems;

public class HexadecimalToDecimal {
    static int convert(int n){
        int res = 0;
        int power = 1;
        while(n!=0){
            int rem = n%10;
            n /= 10;
            res = res + (rem*power);
            power *= 16;
        }
        return res;
    }

    public static void main(String[] args) {
        int num1 = 100;
        int ans = convert(num1);
        System.out.println(ans);
    }
}
