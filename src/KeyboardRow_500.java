import java.util.*;

/**
 * Created by henry on 2021/3/12.
 */
public class KeyboardRow_500 {
    public String[] findWords(String[] words) {
        Set<Character> set1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        Set<Character> set2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        Set<Character> set3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));

        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            boolean oneRow = true;
            if(set1.contains(Character.toLowerCase(words[i].charAt(0)))){
                for(int j = 1; j < words[i].length(); j++){
                    if(!set1.contains(Character.toLowerCase(words[i].charAt(j)))){
                        oneRow = false;
                        break;
                    }
                }
            }else if (set2.contains(Character.toLowerCase(words[i].charAt(0)))) {
                for(int j = 1; j < words[i].length(); j++){
                    if(!set2.contains(Character.toLowerCase(words[i].charAt(j)))){
                        oneRow = false;
                        break;
                    }
                }
            }else if (set3.contains(Character.toLowerCase(words[i].charAt(0)))) {
                for(int j = 1; j < words[i].length(); j++){
                    if(!set3.contains(Character.toLowerCase(words[i].charAt(j)))){
                        oneRow = false;
                        break;
                    }
                }
            }else{
                oneRow = false;
            }
            if(oneRow){
                list.add(words[i]);
            }
        }

        String[] res = new String[list.size()];
        list.toArray(res);
        return res;
    }
}
