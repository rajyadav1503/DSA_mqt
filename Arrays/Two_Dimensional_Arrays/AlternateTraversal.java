package DSA_mqt.Arrays.Two_Dimensional_Arrays;

public class AlternateTraversal {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<matrix.length;i++){
            if(i%2==0){
                for(int j=0;j<matrix[0].length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }else{
                for(int j=matrix[0].length-1;j>=0;j--){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    
}
