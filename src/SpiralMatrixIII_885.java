/**
 * Created by henry on 2021/3/7.
 */
public class SpiralMatrixIII_885 {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int[][] res = new int[R*C][2];
        int idx = 0;
        int len = 0, d = 0;
        res[idx++] = new int[]{r0, c0};
        while(idx != R*C){
            if(d == 0 || d == 2){
                len++;
            }
            for(int i = 0; i < len; i++){
                r0 += dir[d][0];
                c0 += dir[d][1];
                if(r0 >= 0 && r0 < R && c0 >= 0 && c0 < C){
                    res[idx++] = new int[]{r0, c0};
                }
            }
            d = (d + 1) % 4;
        }
        return res;
    }
}

    /*It seems to be annoying, but if we observer the path:

        move right 1 step, turn right
        move down 1 step, turn right
        move left 2 steps, turn right
        move top 2 steps, turn right,
        move right 3 steps, turn right
        move down 3 steps, turn right
        move left 4 steps, turn right
        move top 4 steps, turn right,*/
