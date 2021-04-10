/**
 * Created by henry on 2021/4/10.
 */
public class IsSubsequence_392 {
    public boolean isSubsequence(String s, String t) {
        int tIdx = 0;
        int matchCount = 0;
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            while(tIdx < t.length()){
                if(t.charAt(tIdx) == cur){
                    matchCount++;
                    tIdx++;
                    break;
                }else{
                    tIdx++;
                }
            }
        }
        return matchCount == s.length();
    }
}
