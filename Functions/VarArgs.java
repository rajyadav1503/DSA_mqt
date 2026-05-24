package DSA_mqt.Functions;

import java.util.Arrays;

public class VarArgs {

    // to take as many arguments as we want , not fixed no of argumeents

    static void fun(int a,int b,int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int a, int b, String ...v){       //Method Overloading:- Same name diff arguments.
        System.out.print(a+" "+b+" ");
        System.out.println(Arrays.toString(v));
    }

    public static void main(String[] args) {

            fun(2,3,4,5,6,7,12,323,42);

            fun(1,2,"Raj","Anuj","Nitu");    // function to run is decided by input

    }
}

