/**
 * Created by henry on 2018/8/2.
 */
public class ClimbStairs_70 {
    public static void main(String[] args){
        int stairs = 5;
        ClimbStairs_70 cs = new ClimbStairs_70();
        System.out.println(cs.climbStairs(stairs));
    }

    public int climbStairs(int n) {
        if(n==0 | n==1 | n==2 | n==3)
            return n;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(int i=4; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
