import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by henry on 2021/2/18.
 */
public class ShortestPathinBinaryMatrix_1091 {
    public static void main(String[] args){
        //int[][] input = {{0,0,0},{1,1,0},{1,1,0}};
        //int[][] input = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] input = {{0,0,1,0,0,0,0},{0,1,0,0,0,0,1},{0,0,1,0,1,0,0},{0,0,0,1,1,1,0},{1,0,0,1,1,0,0},{1,1,1,1,1,0,1},{0,0,1,0,0,0,0}};
        ShortestPathinBinaryMatrix_1091 sp = new ShortestPathinBinaryMatrix_1091();
        System.out.println(sp.shortestPathBinaryMatrix(input));
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        int size = grid.length;
        if(grid[0][0] == 1 || grid[size - 1][size - 1] == 1)
            return -1;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int []{0,0});
        grid[0][0] = 1;

        int[][] neighbors = {{1,0},{1,1},{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1}};
        int count = 0;
        while (!queue.isEmpty()){
            count++;
            int qsize = queue.size();
            for(int i = 0; i < qsize; i++){
                int[] point = queue.poll();
                if(point[0] == size - 1 && point[1] == size - 1){
                    return count;
                }
                for(int [] neighbor: neighbors){
                    int nextI = point[0] + neighbor[0];
                    int nextJ = point[1] + neighbor[1];
                    if(nextI >= 0 && nextI < size &&
                            nextJ >= 0 && nextJ < size &&
                            grid[nextI][nextJ] == 0){
                        queue.offer(new int[]{nextI, nextJ});
                        grid[nextI][nextJ] = 1;
                    }
                }
            }
        }

        return -1;
    }

    /*public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;

        int steps = helper(grid, 0, 0, 0);
        return steps == Integer.MAX_VALUE ? -1 : steps;
    }

    int[][] neighbors = {{1,0},{1,1},{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,1}};
    private int helper(int[][] grid, int i, int j, int steps){
        if(grid[i][j] == 1)
            return Integer.MAX_VALUE;

        grid[i][j] = 1;
        steps++;
        if(i == grid.length - 1 && j == grid.length  - 1)
            return steps;

        int minSteps = Integer.MAX_VALUE;
        for(int[] neighbor: neighbors){
            int nextI = i + neighbor[0];
            int nextJ = j + neighbor[1];
            if(nextI >= 0 && nextI < grid.length && nextJ >= 0 && nextJ < grid.length){
                minSteps = Math.min(helper(grid, nextI, nextJ, steps), minSteps);
            }
        }

        grid[i][j] = 0;
        return minSteps;
    }*/
}
