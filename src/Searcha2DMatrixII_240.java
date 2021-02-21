/**
 * Created by henry on 2021/2/21.
 */
public class Searcha2DMatrixII_240 {
    public static void main(String[] args){
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        Searcha2DMatrixII_240 s2 = new Searcha2DMatrixII_240();
        System.out.println(s2.searchMatrix(matrix, 8));
    }

    /*if the target is greater than the value in current position,
    then the target can not be in entire row of current position because the row is sorted,
    if the target is less than the value in current position,
    then the target can not in the entire column because the column is sorted too.*/
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null) return false;
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while(row < m && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }

    /*public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null) return false;
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n - 1;
        while(i < m){
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] > target){
                if(j == 0) break;
                else j--;
            }else{
                i++;
                j = n - 1;
            }
        }
        return false;
    }*/
}
