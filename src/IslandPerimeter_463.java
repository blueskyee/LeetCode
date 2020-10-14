/**
 * Created by henry on 2020/10/14.
 */
public class IslandPerimeter_463 {
    public static void main(String[] args){
        int[][] input = {{0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}};
        IslandPerimeter_463 ip = new IslandPerimeter_463();
        System.out.println(ip.islandPerimeter(input));
    }

    public int islandPerimeter(int[][] grid) {
        if(grid == null || grid.length==0 || grid[0].length==0)
            return 0;
        int count = 0;
        int h = grid.length;
        int w = grid[0].length;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(grid[i][j] == 1){
                    count += 4;
                    if(i>0 && grid[i-1][j]==1) count -= 2;
                    if(j>0 && grid[i][j-1]==1) count -= 2;
                }
            }
        }

        return count;
    }
}
