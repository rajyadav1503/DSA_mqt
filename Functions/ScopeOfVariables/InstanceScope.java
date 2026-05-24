package DSA_mqt.Functions.ScopeOfVariables;

/**
 * Java variables typically fall into one of four primary scopes:
 * 
 * 1. Class Scope (Static Variables): 
 *    Declared with the static keyword inside a class but outside methods. 
 *    These are accessible to all instances of the class and can even be 
 *    accessed without creating an object.
 * 
 * 2. Instance Scope (Instance Variables): 
 *    Declared inside a class but without the static keyword. 
 *    These are tied to a specific object; each instance of the class 
 *    has its own copy.
 * 
 * 3. Method Scope (Local Variables): 
 *    Declared inside a method. They are only visible within that 
 *    specific method and cease to exist once the method finishes execution.
 * 
 * 4. Block Scope: 
 *    Variables declared inside any set of braces {} within a method, 
 *    such as in if statements or for loops. They are only accessible 
 *    within those specific braces.
 */


public class InstanceScope {
    
    int a = 10;    //Instance Variable (inside class , outside methods)
    int b = 20;    //They copy of instance variables is available for all objects.

    int add(int a){
        
        System.out.println(this.a);   //This will output 10 because of this keyword
        return a;     // This will output 6 because of local scope shadows global scope.
    }

    public static void main(String[] args) {
        InstanceScope obj = new InstanceScope();
        int result = obj.add(6);
        System.out.println(result);
    }
}
