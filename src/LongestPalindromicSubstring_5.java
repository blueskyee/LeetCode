/**
 * Created by henry on 2021/2/21.
 */
public class LongestPalindromicSubstring_5 {
    public static void main(String[] args){
        String input = "babad";
        LongestPalindromicSubstring_5 lp = new LongestPalindromicSubstring_5();
        System.out.println(lp.longestPalindrome(input));
    }

    public String longestPalindrome(String s) {
        if(s.isEmpty()) return "";

        //check for every char in s and all extend(add a char in front and end)
        String maxPalin = "";
        for(int i = 0; i < s.length(); i++){
            String curMax1 = extend(s, i, i);
            String curMax2 = extend(s, i, i + 1);
            if(curMax1.length() > maxPalin.length())
                maxPalin = curMax1;
            if(curMax2.length() > maxPalin.length())
                maxPalin = curMax2;

        }

        return maxPalin;
    }

    private String extend(String s, int front, int end){
        for(; front >= 0 && end < s.length(); front--, end++){
            if(s.charAt(front) != s.charAt(end)) break;
        }
        return s.substring(front + 1, end);
    }
}
