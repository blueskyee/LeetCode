import java.util.*;

/**
 * Created by henry on 2021/1/19.
 */
public class WordBreakII_140 {
    public static void main(String[] args){
        String str = "catsanddog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        WordBreakII_140 wb = new WordBreakII_140();
        wb.wordBreak(str, wordDict);
    }

    Map<String, List<String>> map = new HashMap<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        return wordBreak(s, set);
    }

    public List<String> wordBreak(String s, Set<String> wordSet) {
        List<String> res = new ArrayList<>();

        if(s == null || s.length() == 0) return res;
        if(map.containsKey(s)) return map.get(s);
        if(wordSet.contains(s)) res.add(s);

        for(int i = 1; i < s.length(); i++){
            if(wordSet.contains(s.substring(i))){
                List<String> temp = wordBreak(s.substring(0, i), wordSet);
                for(String word: temp){
                    res.add(word + " " + s.substring(i));
                }
            }
        }
        map.put(s, res);

        return res;
    }

    //solution1: Memory Limit Exceeded
/*    public List<String> wordBreak(String s, List<String> wordDict) {
        //need a array of string to store all possible combinations of words os s.subarray
        StringBuilder[] resStr = new StringBuilder[s.length() + 1];
        Set<String> set = new HashSet<String>(wordDict);

        resStr[0] = new StringBuilder("#");
        for(int i = 1; i <= s.length(); i++){
            resStr[i] = new StringBuilder();
            for(int j = 0; j < i; j++){
                if(resStr[j].length() > 0 && set.contains(s.substring(j, i))){
                    if(resStr[j].toString().contains(",")){
                        String[] strArr = resStr[j].toString().split(",");
                        for(int k = 0; k < strArr.length; k++){
                            resStr[i].append(strArr[k]).append(" ").append(s.substring(j, i)).append(",");
                        }
                    }else{
                        resStr[i].append(" ").append(s.substring(j, i)).append(",");
                    }
                }
            }
        }

        List<String> res = new ArrayList<String>();
        if(resStr[s.length()].length() > 0){
            String[] strArr = resStr[s.length()].toString().split(",");
            for(int i = 0; i < strArr.length; i++){
                res.add(strArr[i].substring(1));
            }
        }
        return res;
    }*/
}
