import java.util.HashMap;

/**
 * Created by blueskyee on 2018/12/13.
 */
public class WordPattern_290 {
    public static void main(String[] args){
        String pattern = "abba";
        String str = "dog cat cat dog";
        WordPattern_290 wp = new WordPattern_290();
        System.out.println(wp.wordPattern(pattern, str));
    }

    public boolean wordPattern(String pattern, String str) {
        String[] word = str.split(" ");
        if(pattern.length() == word.length){
            HashMap hm = new HashMap();
            for(int i=0; i<pattern.length(); i++){
                if(hm.put(pattern.charAt(i),i) != hm.put(word[i],i))
                    return false;
            }
            return true;
        }
        return false;
    }

/*    public boolean wordPattern(String pattern, String str) {
        String[] word = str.split(" ");
        if(pattern.length()!=word.length)
            return false;

        HashMap map = new HashMap();
        for(Integer i=0; i<pattern.length(); i++){
            if(map.put(pattern.charAt(i),i) != map.put(word[i],i)){
                return false;
            }
        }
        return true;
    }*/
}

