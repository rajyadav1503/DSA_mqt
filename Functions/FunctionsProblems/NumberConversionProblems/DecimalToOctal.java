package DSA_mqt.Functions.FunctionsProblems.NumberConversionProblems;

public class DecimalToOctal {
     static int convert(int n){
        int res = 0;
        int placevalue = 1;
        while(n!=0){
            int rem = n%8;
            n /= 8;
            res = res + (rem*placevalue);
            placevalue *= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int num1 = 100;
        int ans = convert(num1);
        System.out.println(ans);
    }
    
}
