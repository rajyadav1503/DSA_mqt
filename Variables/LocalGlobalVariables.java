package DSA_mqt;

class Hi{
    static int x = 10;
}
class Hello{
    static int a = Hi.x + 10;      // Here we acessed x variable from Hi class using Hi.x , we did not need to make any object

    //static Hi h = new Hi();
    //static int b = h.x;          //If we dont use static int x then we would have to create object to access it in Hello class
}
public class LocalGlobalVariables {
    public static void main(String[] args) {

        System.out.println(Hello.a);
        byte b1=127;
        b1++;
        System.out.println(b1);
        byte b3 =(byte) (b1+3);
       System.out.println(b3);
    }
}
