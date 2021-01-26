import java.util.HashSet;
import java.util.Set;

/**
 * Created by henry on 2021/1/26.
 */
public class SetMatrixZeroes_73 {
    public static void main(String[] args){
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        SetMatrixZeroes_73 sm = new SetMatrixZeroes_73();
        sm.setZeroes(matrix);
    }

    //space: O(1)
    public void setZeroes(int[][] matrix) {
        boolean isCol = false;
        boolean isRow = false;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                isCol = true;
                break;
            }
        }
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                isRow = true;
                break;
            }
        }
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }
        if(isCol){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        if(isRow){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
    }

    //space: O(m+n)
    /*public void setZeroes(int[][] matrix) {
        Set<Integer> setI = new HashSet<>();
        Set<Integer> setJ = new HashSet<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    setI.add(i);
                    setJ.add(j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(setI.contains(i) || setJ.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }*/
}
