package DSA_mqt.Functions.FunctionsProblems.NumberConversionProblems;

public class DecimalToBinary {
            static int convert(int n){
        int res = 0;
        int placevalue = 1;
        while(n!=0){
            int rem = n%2;
            res = res + (rem * placevalue);
            placevalue *= 10;
            n /= 2;
        }
        return res;
    }

// LONG METHOD:
//    static int convert(int n){
//        int res=0;
//        while(n>0){
//            int rem=n%2;
//            res = (res*10) + rem;
//            n /=2;
//        }
//        int ans = 0;
//        while(res!=0){
//            int rem2 = res%10;
//            res /= 10;
//            ans = ans + rem2;
//            ans*=10;
//        }
//        return ans;
//    }



    public static void main(String[] args) {
        int num1=100;
        int answer = convert(num1);
        System.out.println(answer);
    }
    
}
