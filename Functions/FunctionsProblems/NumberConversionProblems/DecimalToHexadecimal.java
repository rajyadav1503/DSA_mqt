package DSA_mqt.Functions.FunctionsProblems.NumberConversionProblems;

public class DecimalToHexadecimal {
      static int convert(int n){
        int res = 0;
        int placevalue = 1;
        while(n!=0){
            int rem = n%16;
            n /= 16;
            res = res + (rem * placevalue);
            placevalue *= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int num1 = 256;
        int ans = convert(num1);
        System.out.println(ans);
    }
}
