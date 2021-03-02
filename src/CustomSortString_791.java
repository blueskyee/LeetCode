import java.util.HashSet;
import java.util.Set;

/**
 * Created by henry on 2021/3/2.
 */
public class CustomSortString_791 {

    public static void main(String[] args){
        String s = "cba";
        String t = "abcd";
        CustomSortString_791 cs = new CustomSortString_791();
        System.out.println(cs.customSortString(s,t));
    }

    public String customSortString(String S, String T) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < S.length(); i++){
            char cur = S.charAt(i);
            for(int j = 0; j < T.length(); j++){
                if(T.charAt(j) == cur){
                    sb.append(cur);
                    set.add(cur);
                }
            }
        }
        for(int j = 0; j < T.length(); j++){
            if(!set.contains(T.charAt(j))){
                sb.append(T.charAt(j));
            }
        }
        return sb.toString();
    }
}
