/**
 * Created by henry on 2020/9/10.
 */
public class ValidPalindrome_680 {
    public static void main(String args[]){
        String input = "abcca";

        ValidPalindrome_680 vp = new ValidPalindrome_680();
        System.out.println(vp.validPalindrome(input));

    }

    public boolean validPalindrome(String s) {
        int i = -1;
        int j = s.length();
        while (++i < --j){
            if(s.charAt(i) != s.charAt(j))
                return isPalindrome(s, i-1, j) || isPalindrome(s, i, j+1);
        }
        return true;
    }

    public boolean isPalindrome(String s, int leftIdx, int rightIdx){
        while(++leftIdx < --rightIdx){
            if(s.charAt(leftIdx) != s.charAt(rightIdx))
                return false;
        }
        return true;
    }
}
