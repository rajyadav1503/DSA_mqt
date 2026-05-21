package DSA_mqt.Variables;

public class Variables {
    public static int num;
    public static void main(String[] args) {

        System.out.println(num);     // Default value of num will be printed 
        int x =10;  
        System.out.println(x);

        char ch = 'a';
        System.out.println(ch);
        System.out.println(ch++);   // this will convert char into int dataType and 'a' ascii value 98 will be incremented
        System.out.println(ch + 1);  // 98 + 1
        System.out.println(ch + 2);   // 98 +2
    }
}
