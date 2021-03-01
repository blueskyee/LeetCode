import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by henry on 2021/3/1.
 */
public class LongestSubstringWithoutRepeatingCharacters_3 {

    public static void main(String[] args){
        String input = "abcabcbb";
        LongestSubstringWithoutRepeatingCharacters_3 ls = new LongestSubstringWithoutRepeatingCharacters_3();
        System.out.println(ls.lengthOfLongestSubstring(input));
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;

        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int left = 0, right = 0; right < s.length(); right++){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
