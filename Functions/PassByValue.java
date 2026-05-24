package DSA_mqt.Functions;

public class PassByValue {
    static String nameChange(String name){
        name = "Anuj";
        return name;
    }
    public static void main(String[] args) {
        String name = "Raj";
        System.out.println(nameChange(name));

        System.out.println(name);  //The Actual name does not change
                                   // As only copy of the actual variable is passed to a method.
         //OutPut:  Anuj
         //         Raj

        // In java There is only pass by value , there is not a concept of pass by reference.

    }
}
