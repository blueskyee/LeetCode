import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by henry on 2021/3/24.
 */
public class FindAllAnagramsinaString_438 {

    public List<Integer> findAnagrams(String s, String p) {
        int[] charMap = new int[26];
        for(char c: p.toCharArray()){
            charMap[c - 'a']++;
        }

        List<Integer> res = new ArrayList<>();
        int start = 0, end = 0, counter = p.length(), head = 0;
        while(end < s.length()){
            if(charMap[s.charAt(end)] > 0)
                counter--;
            charMap[s.charAt(end)]--;
            end++;
            while(counter == 0){
                if(end - start == p.length()){
                    res.add(start);
                }
                charMap[s.charAt(start)]++;
                if(charMap[s.charAt(start)] > 0)
                    counter++;
                else
                    start++;
            }
        }

        return null;
    }

    //time limit exceeded
    /*public List<Integer> findAnagrams(String s, String p) {
        int[] charMap = new int[26];
        int sLen = s.length();
        int pLen = p.length();
        int counter = pLen;
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < sLen; i++){
            Arrays.fill(charMap, 0);
            for(char c: p.toCharArray()){
                charMap[c - 'a']++;
            }
            counter = pLen;
            for(int j = i; j < (i + pLen) && j < sLen; j++){
                if(charMap[s.charAt(j) - 'a'] > 0){
                    charMap[s.charAt(j) - 'a']--;
                    counter--;
                    if(counter == 0){
                        res.add(i);
                    }
                }else{
                    break;
                }
            }
        }

        return res;
    }*/
}
