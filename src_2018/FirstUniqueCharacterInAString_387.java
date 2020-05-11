/**
 * Created by blueskyee on 2018/12/15.
 */
public class FirstUniqueCharacterInAString_387 {
    public static void main(String[] args){
        String input = "loveleetcode";
        FirstUniqueCharacterInAString_387 fu = new FirstUniqueCharacterInAString_387();
        System.out.println(fu.firstUniqChar(input));
    }

    public int firstUniqChar(String s) {
        int[] charCont = new int[26];
        for(int i=0; i<s.length(); i++){
            charCont[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(charCont[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}
