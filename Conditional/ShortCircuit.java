package DSA_mqt.Conditional;

public class ShortCircuit {
     public static void main(String[] args) {
        int x = 10;
        if(x>5 || x++ >100){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.println(x);
        if(x>5 | x++ >100){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.println(x);

    }
}
