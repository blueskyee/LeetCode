/**
 * Created by henry on 2021/1/28.
 */
public class RotateImage_48 {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        RotateImage_48 ri = new RotateImage_48();
        ri.rotate(matrix);
    }

    public void rotate(int[][] matrix) {
        reflect(matrix);
        transpose(matrix);
    }

    //horizontal reflect
    private void reflect(int[][] matrix){
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n / 2; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[n-j-1][i];
                matrix[n-j-1][i] = temp;
            }
        }
    }
    private void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
