import java.util.HashSet;
import java.util.Set;

/**
 * Created by henry on 2021/1/24.
 */
public class DecodeWays_91 {

    public static void main(String[] args){
        String str = "2201";
        DecodeWays_91 dw = new DecodeWays_91();
        System.out.println(dw.numDecodings(str));
    }

    public int numDecodings(String s) {
        if(s == null || s.length() == 0) return 0;
        Set<String> set = new HashSet<>();
        for(int i = 1; i <= 26; i++){
            set.add(String.valueOf(i));
        }

        int res = 0;
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        if(set.contains(s.substring(0, 1))){
            dp[1] = 1;
        }else{
            return res;
        }
        for(int i = 2; i <= s.length(); i++){
            if(set.contains(s.substring(i - 1, i))){
                dp[i] += dp[i - 1];
            }
            if(set.contains(s.substring(i - 2, i))){
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }

    //Time Limit Exceeded
    /*static Set<String> set = new HashSet<>();
    public static void main(String[] args){
        String str = "2101";
        DecodeWays_91 dw = new DecodeWays_91();
        for(int i = 1; i <= 26; i++){
            set.add(String.valueOf(i));
        }
        System.out.println(dw.numDecodings(str));
    }

    public int numDecodings(String s) {
        if(s == null || s.length() == 0) return 1;

        int res = 0;
        if(s.length() > 0 && set.contains(s.substring(0, 1))){
            res += numDecodings(s.substring(1));
        }
        if(s.length() > 1 && set.contains(s.substring(0, 2))){
            res += numDecodings(s.substring(2));
        }
        return res;
    }*/
}
