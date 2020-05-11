/**
 * Created by henry on 2018/7/19.
 */
public class PalindromeNumber_9 {
    public static void main(String[] args) {
        int input = 121;
        PalindromeNumber_9 pn = new PalindromeNumber_9();
        System.out.print(pn.isPalindrome(input));
    }

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else {
            int temp = x;
            int reverseInt = 0;
            while (x != 0) {
                reverseInt = reverseInt * 10 + x % 10;
                x = x / 10;
            }
            return temp == reverseInt;
        }
    }
}
