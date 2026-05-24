package DSA_mqt.Functions.FunctionsProblems.GoodProblems;

public class Replace_0_With_5 {
       // Edge case: if the input is 0, the answer is immediately 5
        if (n == 0) {
            return 5;
        }

        int result = 0;
        int placeValue = 1;

        while (n > 0) {
            int digit = n % 10;

            // If the digit is 0, change it to 5
            if (digit == 0) {
                digit = 5;
            }

            // Rebuild the number from the right side
            result = result + (digit * placeValue);

            // Move to the next digit and increase place value (1, 10, 100...)
            placeValue *= 10;
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int ans = replace(1004);
        System.out.println(ans);
    }
}
