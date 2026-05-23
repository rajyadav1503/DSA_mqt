package DSA_mqt.NestedLoops.Patterns;

public class W_alphabet {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(j==1){
                    System.out.print("* ");
                }else if(j==n-i+1){
                    System.out.print("*");
                }else{
                    System.out.print("  ");
                }
            }

            for(int j=n*2;j<n*2+i;j++){
                System.out.print(" ");
            }
            for(int j=n*2;j<=n*2+n-1;j++){
                if(j==n*2 || j==n*2+n-i ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
  
}
