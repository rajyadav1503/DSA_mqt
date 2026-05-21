package DSA_mqt.NestedLoops.Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
          for(int i=1;i<=n;i++){
            char ch='A';          //Here we take ch='A' inside for as we want in every to start from A
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

          for(int i=1;i<=n;i++){
            
            for(int j=0;j<i;j++){
                System.out.print((char)('A' + j));
                
            }
            System.out.println();
        }

        System.out.println();

        //Pyramid of this

          for(int i=1;i<=n;i++){
            
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Reverse of that
          for(int i=1;i<=n;i++){
            
            for(int j=0;j<n-i;j++){
                System.out.print((char)('A' + j));
                
            }
            System.out.println();
        }
    }
}
