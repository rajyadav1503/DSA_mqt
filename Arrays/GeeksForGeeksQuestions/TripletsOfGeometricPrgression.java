package DSA_mqt.Arrays.GeeksForGeeksQuestions;

public class TripletsOfGeometricPrgression {
    static void findTriplets(int[] arr){
        for(int j=1;j<arr.length-1;j++){
            int i=j-1;
            while(i >= 0){
                int k = j+1;
                while(k<arr.length){
                    if(arr[j]*arr[j] == arr[i]*arr[k]){
                        System.out.println(" "+arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                    k++;
                }
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8};
        findTriplets(arr);
    }
    
}
