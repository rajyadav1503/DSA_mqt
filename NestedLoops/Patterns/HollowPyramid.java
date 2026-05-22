package DSA_mqt.NestedLoops.Patterns;

public class HollowPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==1 || i==n || j==1 || j==i){
                    System.out.print("*" + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
