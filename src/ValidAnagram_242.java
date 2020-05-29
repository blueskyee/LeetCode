import java.util.Arrays;

/**
 * Created by henry on 2018/9/16.
 */
public class ValidAnagram_242 {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        ValidAnagram_242 va = new ValidAnagram_242();
        System.out.println(va.isAnagram(s,t));
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr,tArr);
    }

/*    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }*/
}
