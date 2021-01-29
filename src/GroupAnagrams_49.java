import java.util.*;

/**
 * Created by henry on 2021/1/29.
 */
public class GroupAnagrams_49 {
    public static void main(String[] args){

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String sortedStr = String.valueOf(temp);
            if(map.containsKey(sortedStr)){
                map.get(sortedStr).add(strs[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortedStr, list);
            }
        }

        return new ArrayList(map.values());
    }
}
