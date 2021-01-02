import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2020/12/30.
 */
public class PacificAtlanticWaterFlow_417 {
    public static void main(String[] args){

    }

    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return res;
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];
        for(int i=0; i<n; i++){
            dfs(matrix, pacific, Integer.MIN_VALUE, i, 0);
            dfs(matrix, atlantic, Integer.MIN_VALUE, i, m-1);
        }
        for(int i=0; i<m; i++){
            dfs(matrix, pacific, Integer.MIN_VALUE, 0, i);
            dfs(matrix, atlantic, Integer.MIN_VALUE, n-1, i);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    List<Integer> point = new ArrayList<>();
                    point.add(i);
                    point.add(j);
                    res.add(point);
                }
            }
        }

        return res;
    }

    int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

    private void dfs(int[][] matrix, boolean[][] visited, int height, int x, int y){
        int n = matrix.length;
        int m = matrix[0].length;
        if(x < 0 || x >= n || y < 0 || y >= m || visited[x][y] || matrix[x][y] < height)
            return;
        visited[x][y] = true;
        for(int[] d:dir){
            dfs(matrix, visited, matrix[x][y], x + d[0], y + d[1]);
        }
    }


    /*public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(canTouchAtlantic(matrix, i, j)
                        && canTouchPacific(matrix, i, j)){
                    List<Integer> point = new ArrayList<Integer>();
                    point.add(i);
                    point.add(j);
                    res.add(point);
                }
            }
        }

        return res;
    }

    private boolean canTouchAtlantic(int[][] matrix, int curI, int curJ){
        if(curI == matrix.length-1 || curJ == matrix[0].length-1){
            return true;
        }else if(matrix[curI][curJ] >= matrix[curI+1][curJ]){
            return canTouchAtlantic(matrix, curI+1, curJ);
        }else if(matrix[curI][curJ] >= matrix[curI][curJ+1]){
            return canTouchAtlantic(matrix, curI, curJ+1);
        }else{
            return false;
        }
    }

    private boolean canTouchPacific(int[][] matrix, int curI, int curJ){
        if(curI == 0 || curJ == 0){
            return true;
        }else if(matrix[curI][curJ] >= matrix[curI-1][curJ]){
            return canTouchPacific(matrix, curI-1, curJ);
        }else if(curJ > 0 && matrix[curI][curJ] >= matrix[curI][curJ-1]){
            return canTouchPacific(matrix, curI, curJ-1);
        }else{
            return false;
        }
    }*/
}
