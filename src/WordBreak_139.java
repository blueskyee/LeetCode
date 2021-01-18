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
        HashSet<String> set = new HashSet<String>(wordDict);
        return worBreak(s, set);
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
