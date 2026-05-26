package DSA_mqt.Functions;

// same function name but the behavior is different

public class FunctionOverRiding {

    public class A{
        public int fun1(int a,int b){
            return a+b;
        }
    }

    class B extends A{

        @Override
        public int fun1(int a,int b){
            return a*b;
        }
    }
    
}
