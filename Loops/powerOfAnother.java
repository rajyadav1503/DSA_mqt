package DSA_mqt.Loops;

public class powerOfAnother {
     public static boolean isPower(int x, int y) {
        // code here
        if(x==1) return (y==1);
        while(y%x==0){
            y /= x;
        }
       return y==1;
    }
    public static void main(String[] args) {
        System.out.println(isPower(5,25));
    }
}
