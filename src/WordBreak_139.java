import java.util.*;

/**
 * Created by henry on 2021/1/17.
 */
public class WordBreak_139 {
    public static void main(String[] args){
        String str = "applepenapple";
        String[] dict = {"apple", "pen"};
        WordBreak_139 wb = new WordBreak_139();
        wb.wordBreak(str, Arrays.asList(dict));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<String>(wordDict);
        boolean[] res = new boolean[s.length() + 1];
        res[0] = true;
        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(res[j] && set.contains(s.substring(j, i)))
                    res[i] = true;
            }
        }
        return res[s.length()];
    }

    //brute force
    /*private boolean worBreak(String s, HashSet<String> set){
        if(s.length() == 0) return true;
        for(int i = 1; i <= s.length(); i++){
            if(set.contains(s.substring(0, i))){
                if(worBreak(s.substring(i), set))
                    return true;
                else
                    continue;
            }
        }
        return false;
    }*/
}
