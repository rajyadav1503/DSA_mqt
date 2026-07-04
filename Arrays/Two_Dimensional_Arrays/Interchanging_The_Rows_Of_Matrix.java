package DSA_mqt.Arrays.Two_Dimensional_Arrays;

import java.util.Arrays;

public class Interchanging_The_Rows_Of_Matrix {

    //1st row becomes last and the last row becomes first .
    // 2nd row becomes 2nd last and 2nd last becomes 2nd row and so on.
    
    public static void interchangeRows(int matrix[][]) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0;
        int bottom = m-1;
        while(top<bottom){
            for(int col=0;col<n;col++){
                int temp = matrix[top][col];
                matrix[top][col]=matrix[bottom][col];
                matrix[bottom][col] = temp;
            }
            top++;
            bottom--;
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        interchangeRows(arr);
        System.out.println(Arrays.deepToString(arr));
    }

}
