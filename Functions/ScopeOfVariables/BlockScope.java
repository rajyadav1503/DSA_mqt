package DSA_mqt.Functions.ScopeOfVariables;

public class BlockScope {
    
//     4. Block Scope: 
//  *    Variables declared inside any set of braces {} within a method, 
//  *    such as in if statements or for loops. They are only accessible 
//  *    within those specific braces.

         public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        {
            System.out.println(a); // we can access variable which is defined in same method inside the block

         //   int a = 10;   // (ERROR) We cannot initialize the variable again which is already initialized in the same method.
            a = 30;  // Although we can change/update the variable .

            int c = 40;   // we can also initialize a new variable inside the block.
                          // Althogh this variable will not be accessible outside the block.
        }

     //   System.out.println(c); // ERROR . we cannot access variable defined inside an block outside that block.
    }
    
}
