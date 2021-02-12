import java.util.Arrays;

/**
 * Created by henry on 2021/2/12.
 */
public class LongestSubstringwithAtLeastKRepeatingCharacters_395 {

    public int longestSubstring(String s, int k) {
        if(s.isEmpty() || k > s.length())
            return 0;
        int[] countMap = new int[26];
        int res = 0;
        for(int start = 0; start < s.length(); start++){
            Arrays.fill(countMap, 0);
            for(int end = start; end < s.length(); end++ ){
                countMap[s.charAt(end) - 'a']++;
                if(isValidSubStr(countMap, k)){
                    res = Math.max(res, end - start + 1);
                }
            }
        }
        return res;
    }

    private boolean isValidSubStr(int[] countMap, int k){
        int disCount = 0;
        int kCount = 0;
        for(int count: countMap){
            if(count > 0) disCount++;
            if(count >= k) kCount++;
        }
        return disCount == kCount;
    }
}
