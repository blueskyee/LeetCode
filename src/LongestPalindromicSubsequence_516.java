/**
 * Created by henry on 2021/2/15.
 */
public class LongestPalindromicSubsequence_516 {

    public static void main(String[] args){
        String input = "bbbab";
        LongestPalindromicSubsequence_516 lp = new LongestPalindromicSubsequence_516();
        System.out.println(lp.longestPalindromeSubseq(input));
    }

    public int longestPalindromeSubseq(String s) {
        int [][] dp = new int[s.length()][s.length()];
        for(int i = s.length() - 1; i >= 0; i--){
            dp[i][i] = 1;
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                }else{
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][s.length() - 1];
    }
}
