package DSA_mqt.Functions;

public class CallStack {
    public static int add1(int a , int b){
        System.out.println("Add1 called");
        int result2 = add2(2,3,4);
        System.out.println(result2);
        System.out.println("Add 1 finished");
        return a+b;
    }

    public static int add2(int a , int b , int c){
        System.out.println("Add2 called");
        System.out.println("Add2 finished");
        return a+b+c;
    }

    // public void StaticKiStudy(){
    //     static int  num = 10;     //func ke andar static nahi aa sakta.

    // }

    public static void main(String[] args) {
        System.out.println("Main call hua");
        add1(2, 4);
        System.out.println("main ended");
    }

    
}
