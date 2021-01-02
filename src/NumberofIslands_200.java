/**
 * Created by henry on 2021/1/2.
 */
public class NumberofIslands_200 {
    public static void main(String[] args){
        char[][] input = {
                          {'1','1','0','0','0'},
                          {'1','1','0','0','0'},
                          {'0','0','1','0','0'},
                          {'0','0','0','1','1'}
                         };
        NumberofIslands_200 ni = new NumberofIslands_200();
        System.out.println(ni.numIslands(input));
    }

    public int numIslands(char[][] grid) {
        int count = 0;
        if(grid == null || grid[0].length==0)
            return count;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == '1'){
                    dfsMarker(grid, i , j);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfsMarker(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0')
            return;
        grid[i][j] = '0';
        dfsMarker(grid, i+1, j);
        dfsMarker(grid, i-1, j);
        dfsMarker(grid, i, j+1);
        dfsMarker(grid, i, j-1);
    }

}
