/**
 * Created by henry on 2018/12/10.
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
        int h = grid.length;
        if (h==0) return 0;
        int w = grid[0].length;
        int res = 0;

        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(grid[i][j]==1){
                    if(i==0 || grid[i-1][j]==0) res++;
                    if(j==0 || grid[i][j-1]==0) res++;
                    if(i==h-1 || grid[i+1][j]==0) res++;
                    if(j==w-1 || grid[i][j+1]==0) res++;
                }
            }
        }
        return res;
    }
}
