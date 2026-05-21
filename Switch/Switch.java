package DSA_mqt.Switch;

public class Switch {
    void fun1(){
        int num = 2;

        switch (num) {
            case 1:

            case 2:

            case 3:
                System.out.println("Small Number");  //case 2 matched but does not has break so case3 will execute.
                break;
            default:
                System.out.println("Large number");

        }
    }

    void fun2(){
        int num = 2;

        switch (num) {
            case 1:

            case 2:
                System.out.println("Good Morning");

            case 3:
                System.out.println("Hii");
                break;

            default:
                System.out.println("Hello");

        }
    }



    public static void main(String[] args) {
        Switch sw = new Switch();

        sw.fun1();
        sw.fun2();
    }
}
