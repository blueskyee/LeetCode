import java.util.HashSet;
import java.util.Set;

/**
 * Created by henry on 2021/1/24.
 */
public class DecodeWays_91 {
    static Set<String> set = new HashSet<>();

    public static void main(String[] args){
        String str = "2101";
        DecodeWays_91 dw = new DecodeWays_91();
        for(int i = 1; i <= 26; i++){
            set.add(String.valueOf(i));
        }
        System.out.println(dw.numDecodings(str));
    }

    public int numDecodings(String s) {
        if(s == null || s.length() == 0) return 1;

        int res = 0;
        if(s.length() > 0 && set.contains(s.substring(0, 1))){
            res += numDecodings(s.substring(1));
        }
        if(s.length() > 1 && set.contains(s.substring(0, 2))){
            res += numDecodings(s.substring(2));
        }
        return res;
    }

}
