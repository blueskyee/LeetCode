import java.util.HashSet;
import java.util.Set;

/**
 * Created by blueskyee on 2016/2/12.
 */
public class WordBreak_4 {

    public static void main(String[] args) {
        try {
            Set<String> dict = new HashSet<String>();
            dict.add("leet");
            dict.add("code");
            dict.add("test");

            String str = "leetcode";

            System.out.print("result:" + wordBreak(str,dict));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean wordBreak(String s, Set<String> dict){
        boolean[] t = new boolean[s.length()+1];
        t[0] = true;

        for(int i=0; i<s.length(); i++){
            if(!t[i])
                continue;

            for(String a : dict){
                int len = a.length();
                int end = i+len;
                if(end>s.length())
                    continue;
                if(s.substring(i,end).equals(a)){
                    t[end] = true;
                }
            }
        }
        return t[s.length()];
    }
}
