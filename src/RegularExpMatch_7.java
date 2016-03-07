/**
 * Created by blueskyee on 2016/2/13.
 */
public class RegularExpMatch_7 {
    public static void main(String[] args) {
        String str = "abab";
        String pattern = "abab.*";
        try {
            RegularExpMatch_7 reExpMatch = new RegularExpMatch_7();
            boolean match = reExpMatch.isMatch(str,pattern);
            System.out.println("match result:" + match);

            reExpMatch.subStringTest();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isMatch(String s, String p) throws Exception{
        //length=0
        if(p.length()==0){
            return  s.length()==0;
        }
        // length=1, special case
        if(p.length()==1){
            if(s.length()<1){
                return false;
            }else if(s.charAt(0)!=p.charAt(0) && p.charAt(0)!='.'){
                return  false;
            }else{
                return isMatch(s.substring(1),p.substring(1));
            }
        }
        // case 1: when the second char of p is not '*'
        if(p.charAt(1)!='*'){
            if(s.length()<1){
                return false;
            }else if(s.charAt(0)!=p.charAt(0) && p.charAt(0)!='.'){
                return  false;
            }else{
                return isMatch(s.substring(1),p.substring(1));
            }
            // case 2: when the second char of p is '*', complex case.
        }else{
            if(isMatch(s,p.substring(2))){
                return true;
            }
            //
            int i=0;
            while (i<s.length() && (s.charAt(i)==p.charAt(0) || p.charAt(0)=='.')){
                if(isMatch(s.substring(i+1),p.substring(2))){
                    return true;
                }
                i++;
            }
            return false;
        }
    }

    public void subStringTest(){
        try {
            String str = "abcd";
            System.out.print("subString:" + str.substring(4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
