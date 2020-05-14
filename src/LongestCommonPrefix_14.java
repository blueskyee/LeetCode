/**
 * Created by henry on 2018/7/23.
 */
public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String[] strAry = {"flower","flow","flowers"};
        LongestCommonPrefix_14 lcp = new LongestCommonPrefix_14();
        System.out.println("common prefix:" + lcp.longestCommonPrefix(strAry));
    }

    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for(int i=0; i<strs.length; i++){
            if(minLen > strs[i].length()) {
                minLen = strs[i].length();
            }
        }

        for(int i=1; i<strs.length; i++){
            for(int j=0; j<minLen; j++){
                if(strs[0].charAt(j) != strs[i].charAt(j)){
                    minLen = j;
                    break;
                }
            }
        }

        if(minLen == 0 || strs.length == 0){
            return "";
        }else{
            return strs[0].substring(0,minLen);
        }

    }


/*    public String longestCommonPrefix(String[] strs) {
        int minStrLen = Integer.MAX_VALUE;
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<strs.length; i++){
            if(minStrLen > strs[i].length()) {
                minStrLen = strs[i].length();
            }
        }

        for(int i=1; i<strs.length; i++){
            for(int j=0; j<minStrLen; j++){
                if(strs[0].charAt(j) != strs[i].charAt(j)){
                    minStrLen = j;
                    break;
                }
            }
        }

        if(minStrLen == 0 || strs.length == 0)
            return "";
        else
            return strs[0].substring(0,minStrLen);

    }*/
}
