package DSA_mqt.NestedLoops.Patterns;

public class StairCase {
    public static void main(String[] args) {
        int n = 5;
        int stars = 2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();

            if(i%2==0){
                stars += 2;
            }
        }
    }
}
