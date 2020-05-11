/**
 * Created by henry on 2018/7/30.
 */
public class LengthOfLastWord_58 {
    public static void main(String[] args){
        String str = "hello ";
        LengthOfLastWord_58 llw = new LengthOfLastWord_58();
        System.out.println(llw.lengthOfLastWord(str));
    }

    public int lengthOfLastWord(String s) {
        String[] s_ary = s.split(" ");
        return s_ary.length>0 ? s_ary[s_ary.length-1].length() : 0;
    }
}
