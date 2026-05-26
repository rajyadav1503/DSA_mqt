package DSA_mqt.Functions;

public class FunctionsOverLoading {
    static int add(int a,int b){
        return a+b;
    }

    static int add(int a,int b,int c){
        return a+b+c;
    }

    static void add(int a){
        int sum = a;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int ans1 = add(2,3);
        System.out.println(ans1);
        int ans2 = add(1,2,3);
        System.out.println(ans2);
        add(2);
    }
}
