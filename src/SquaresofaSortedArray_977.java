/**
 * Created by henry on 2020/10/19.
 */
public class SquaresofaSortedArray_977 {
    public static void main(String[] args){
        int[] input = {-4,-1,0,3,10};
        SquaresofaSortedArray_977 ssa = new SquaresofaSortedArray_977();
        System.out.println(ssa.sortedSquares(input));
    }

    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int i=0,j=n-1;
        int[] result  = new int[n];
        for(int k=n-1; k>=0; k--){
            if(Math.abs(A[i]) > Math.abs(A[j])){
                result[k] = A[i] * A[i];
                i++;
            }else{
                result[k] = A[j] * A[j];
                j--;
            }
        }

        return result;
    }
}
