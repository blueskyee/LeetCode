/**
 * Created by henry on 2020/11/17.
 */
public class ClimbingStairs_70 {
    public static void main(String[] args){
        int input = 4;
        ClimbingStairs_70 cs = new ClimbingStairs_70();
        System.out.println(cs.climbStairs(input));
    }

    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }else{
            int[] res = new int[n];
            res[0] = 1;
            res[1] = 2;
            for(int i=2; i<n; i++){
                res[i] = res[i-1] + res[i-2];
            }
            return res[n-1];
        }
    }
}
