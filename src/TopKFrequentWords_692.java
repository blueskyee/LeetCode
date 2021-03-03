import java.util.*;

/**
 * Created by henry on 2021/3/3.
 */
public class TopKFrequentWords_692 {

    public static void main(String[] args){
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        TopKFrequentWords_692 tk = new TopKFrequentWords_692();
        System.out.println(tk.topKFrequent(words, 2));
    }

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> list = new ArrayList(map.keySet());
        Collections.sort(list, (w1, w2) ->
                map.get(w1).equals(map.get(w2))? w1.compareTo(w2) : map.get(w2) - map.get(w1));
        return list.subList(0, k);
    }
}
