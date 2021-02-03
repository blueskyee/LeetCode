/**
 * Created by henry on 2021/2/3.
 */
public class Searcha2DMatrix_74 {
    public static void main(String[] args){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        Searcha2DMatrix_74 s2 = new Searcha2DMatrix_74();
        System.out.println(s2.searchMatrix(matrix, 13));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null) return false;
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n - 1;
        while (i < m && j >= 0){
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }

    //binary search
    /*public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null) return false;
        int m = matrix.length, n = matrix[0].length;
        int start = 1, end = m * n;
        while (start <= end){
            int mid = (start + end) / 2;
            int row = (mid - 1) / n;
            int col = (mid - 1) % n;
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }*/
}
