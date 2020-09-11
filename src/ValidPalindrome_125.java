/**
 * Created by henry on 2020/9/11.
 */
public class ValidPalindrome_125 {
    public static void main(String[] args){
        String input = "race a car";

        ValidPalindrome_125 vp = new ValidPalindrome_125();
        System.out.println(vp.isPalindrome(input));
    }

    public boolean isPalindrome(String s) {
        for(int left=0, right=s.length()-1; left <= right; left++, right--){
            while(!Character.isLetterOrDigit(s.charAt(left))){
                if(left>=right)
                    break;
                left++;
            }
            while(!Character.isLetterOrDigit(s.charAt(right))){
                if(left>=right)
                    break;
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))){
                return false;
            }
        }
        return true;
    }
}
