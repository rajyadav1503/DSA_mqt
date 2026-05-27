package DSA_mqt.Arrays.BasicsOfArray;

public class Intro {
      public static void main(String[] args) {

        // syntax
        // datatype[] variable_name = new datatype[size];

        // store 5 roll numbers:
        int[] rollno = new int[5]; // note you have to mention the size over here during initializaton. otherwise error occurs.
        // OR Directly
        int[] rollno2 = {23,34,54,54,54};  //if you directly give the value , no need to mention size.

        int[] ros ; // declaration of array. ros is getting defined in the stack , it is not pointing to any memory.
        ros = new int[4];  // initialization: actually here the object is being created in the memory (heap).



    }
}
