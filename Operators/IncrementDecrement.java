package DSA_mqt.Operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 1;
        ++a;
        int b = a++ ;
        int c = ++b + b++;
        System.out.println(c);
        int x = 5;
        System.out.println(x++ + ++x * x++);
        System.out.println(x);

        int z = 1;
        System.out.println(++z + z++ + --z + z--);
        System.out.println(z);
    }
}
