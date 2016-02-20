/**
 * Created by blueskyee on 2016/2/19.
 */
public class ImplementStrStr_15 {
    public static void main(String[] args) {
        String haystack = "i'm doing leetcode";
        String needle = "leetcode";
        try {
            ImplementStrStr_15 is = new ImplementStrStr_15();
            int result = is.strStr(haystack,needle);
            System.out.print("result:" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int strStr(String haystack, String needle) throws Exception{
        if(haystack==null || needle==null || needle.length()<1)
            return 0;

        for(int i=0; i<haystack.length(); i++){
            if(i+needle.length() > haystack.length())
                return -1;
            int hayIdx = i;
            for(int j=0; j<needle.length(); j++){
                if (needle.charAt(j) == haystack.charAt(hayIdx)){
                    if(j==needle.length()-1)
                        return i;
                    hayIdx++;
                }else{
                    break;
                }
            }
        }
        return -1;
    }
}
