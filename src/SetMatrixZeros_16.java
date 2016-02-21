/**
 * Created by blueskyee on 2016/2/19.
 */
public class SetMatrixZeros_16 {

    public void setZeroes ( int [ ] [ ] matrix ) {
        //1:check if there is 0 in first column&row
        boolean firstColZeroFlag = false;
        boolean firstRowZeroFlag = false;

        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0]==0){
                firstColZeroFlag = true;
                break;
            }
        }
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[0][j]==0){
                firstRowZeroFlag = true;
                break;
            }
        }
        //2: mark 0 on first column&row
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //3: set column&row 0 by mark
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }
        //4: set first column&row 0 by flag
        if(firstColZeroFlag==true){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        if(firstRowZeroFlag==true){
            for(int j=0; j<matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
    }
}
