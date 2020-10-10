import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TopLevelAttribute;

/**
 * Created by henry on 2020/10/10.
 */
public class ToeplitzMatrix_766 {
    static public void main(String[] args){
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 1, 2, 3},
                          {9, 5, 1, 2}};
        ToeplitzMatrix_766 tm = new ToeplitzMatrix_766();
        System.out.println(tm.isToeplitzMatrix(matrix));
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length-1; i++){
            for(int j=0; j<matrix[0].length-1; j++){
                if(matrix[i][j] != matrix[i+1][j+1])
                    return false;
            }
        }

        return true;
    }
}
