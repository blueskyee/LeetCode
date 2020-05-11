/**
 * Created by blueskyee on 2016/2/13.
 */
public class LongestPalindrome_3 {

    public static void main(String[] args) {
        String testStr = "abcdcbef";
        LongestPalindrome_3 lp = new LongestPalindrome_3();
        String longPalin = lp.findLongestPalindrome(testStr);
        System.out.print("longest palindrome of " + testStr + " is: " + longPalin);
    }

    public String findLongestPalindrome(String str){
        String longestPalindrome = str.substring(0,1);
        try {
            for(int i=0; i<str.length(); i++){
                String palindrome = findPalindrome(str,i,i);
                if(palindrome.length()>longestPalindrome.length()){
                    longestPalindrome = palindrome;
                }

                palindrome = findPalindrome(str,i,i+1);
                if(palindrome.length()>longestPalindrome.length()){
                    longestPalindrome = palindrome;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return longestPalindrome;
    }

    public String findPalindrome(String str, int beginIdx, int endIdx) throws Exception{
        while (beginIdx>=0 && endIdx<=str.length()-1
                && str.charAt(beginIdx)==str.charAt(endIdx)){
            beginIdx--;
            endIdx++;
        }
        return str.substring(beginIdx+1,endIdx);
    }
}
