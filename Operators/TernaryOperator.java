package DSA_mqt.Operators;

public class TernaryOperator {
    public static void main(String[] args) {
       int x = 6;
//        if(x==5)
//            ;
//        {
//            System.out.println("Java");
//        }
//
//        //if-else
//
//        int a = 7;
//
//        if (a>5)
//            System.out.println("A");
//        if (a<6)
//            System.out.println("B");
//        else
//            System.out.println("C");
//
        int b = 5;
        if(x<10)
            System.out.println(b<10 ? "A" : "B");
       else
           System.out.println("Inside else");
//               System.out.println("outside else");
//
//               //Ternary Operators
//        int c = 5;
//        int d = 10;
//        int z = c > d ? c : d ;
//        System.out.println(z);

        // MAX_OF_THREE

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int max = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3) ;
        System.out.println(max);

        // Eligible for voting or not

        int age = 15;
        System.out.println(age >= 18 ? "Eligible" : "Not eligible");


    }
}
