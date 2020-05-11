/**
 * Created by henry on 2018/11/1.
 */
public class FindTheDifference_389 {
    public static void main(String[] args){
        String s = "abcd";
        String t = "abcde";
        FindTheDifference_389 ftd = new FindTheDifference_389();
        System.out.print(ftd.findTheDifference(s,t));
    }

    public char findTheDifference(String s, String t) {
        char temp=0;
        for(int i=0; i<s.length(); i++){
            temp ^= s.charAt(i);
        }
        for(int i=0; i<t.length(); i++){
            temp ^= t.charAt(i);
        }
        return temp;
    }
}
