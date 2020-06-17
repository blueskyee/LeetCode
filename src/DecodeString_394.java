import java.util.Stack;

/**
 * Created by blueskyee on 2020/6/17.
 */
public class DecodeString_394 {
    public static void main(String[] args){
        DecodeString_394 ds = new DecodeString_394();
        System.out.println(ds.decodeString("3[a2[c]]"));
    }

    public String decodeString(String s) {
        Stack<Integer> timeSt = new Stack<Integer>();
        Stack<String> strSt = new Stack<String>();
        String curStr = "";

        int idx = 0;
        while (idx < s.length()){
            if(Character.isDigit(s.charAt(idx))){
                int cnt = 0;
                while (Character.isDigit(s.charAt(idx))){
                    cnt = cnt * 10 + (s.charAt(idx) - '0');
                    idx++;
                }
                timeSt.push(cnt);
            }else if(s.charAt(idx) == '['){
                strSt.push(curStr);
                curStr = "";
                idx++;
            }else if(s.charAt(idx) == ']'){
                int repeat = timeSt.pop();
                StringBuilder sb = new StringBuilder(strSt.pop());
                for(int i=0; i<repeat; i++){
                    sb.append(curStr);
                }
                curStr = sb.toString();
                idx++;
            }else{
                curStr += s.charAt(idx);
                idx++;
            }
        }

        return curStr;
    }
}
