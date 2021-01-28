import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2021/1/26.
 */
public class SpiralMatrix_54 {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        SpiralMatrix_54 sm = new SpiralMatrix_54();
        sm.spiralOrder(matrix);
    }

    int[][] move = {{0,1},{1,0},{0,-1},{-1,0}};
    public List<Integer> spiralOrder(int[][] matrix) {
        boolean[][] visit  = new boolean[matrix.length][matrix[0].length];
        List<Integer> res = new ArrayList<>();
        helper(matrix, 0, 0, 0, visit, res);
        return res;
    }

    private List<Integer> helper(int[][] matrix, int i, int j,
                                 int moveIdx, boolean[][] visit,
                                 List<Integer> res){
        res.add(matrix[i][j]);
        visit[i][j] = true;

        if(needChangeDir(matrix, visit, i, j, moveIdx) &&
                canChangeDir(matrix, visit, i, j, moveIdx)){
            int newMoveIdx = (moveIdx + 1) % 4;
            helper(matrix, i + move[newMoveIdx][0], j + move[newMoveIdx][1],
                    newMoveIdx, visit, res);
        }else if(!needChangeDir(matrix, visit, i, j, moveIdx)){
            helper(matrix, i + move[moveIdx][0], j + move[moveIdx][1],
                    moveIdx, visit, res);
        }
        return res;
    }

    private boolean needChangeDir(int[][] matrix, boolean[][] visit,
                                  int i, int j, int moveIdx){
        int newRow = i + move[moveIdx][0];
        int newCol = j + move[moveIdx][1];
        if(newRow >= 0 && newRow < matrix.length &&
                newCol >= 0 && newCol < matrix[0].length &&
                !visit[newRow][newCol]){
            return false;
        }
        return true;
    }

    private boolean canChangeDir(int[][] matrix, boolean[][] visit,
                                 int i, int j, int moveIdx){
        int newMoveIdx = (moveIdx + 1) % 4;
        int newRow = i + move[newMoveIdx][0];
        int newCol = j + move[newMoveIdx][1];
        if(newRow >= 0 && newRow < matrix.length &&
                newCol >= 0 && newCol < matrix[0].length &&
                !visit[newRow][newCol]){
            return true;
        }
        return false;
    }
}
