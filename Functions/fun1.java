package DSA_mqt.Functions;

public class fun1 {
    int a = 5;   //Gloabal scope

    // Functions helps in : readability ; reusability ; modularity(complex problem into small parts)

    // Static variables and static methods are stored in stack memory 

    public static int divide(int a, int b){    //No need to create object
        return a/b;
    }
    public int mul(int a, int b){    // we need to create object to access it 
        return a*b;
    }

    public int add(int a,int b){
            int v = 4;   // This is local Variable with function scope
            if(2+3==6){
                int c=3;  // This is block variable which has block scope 
                int d=5;
            }

            int num1 =0;
            int num2 = 1;       
    }

    public static void main(String[] args) {

        fun1 obj = new fun1();   //creating object
        System.out.println(obj.mul(2,3));  // Accessing through object
        System.out.println(divide(6,3));

        

    }
}
