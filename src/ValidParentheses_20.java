import java.util.Stack;

/**
 * Created by henry on 2020/10/15.
 */
public class ValidParentheses_20 {
    public static void main(String[] args) throws Exception {
        String input = "()[]{}";
        ValidParentheses_20 vp = new ValidParentheses_20();
        System.out.println(vp.isValid(input));
    }

    public boolean isValid(String s) throws Exception{
        Stack st = new Stack();
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='(' || ch[i]=='[' || ch[i]=='{'){
                st.push(ch[i]);
            }else if(ch[i]==')'){
                if(st.empty() || !st.pop().equals('('))
                    return false;
            }else if(ch[i]==']'){
                if(st.empty() || !st.pop().equals('['))
                    return false;
            }else if(ch[i]=='}'){
                if(st.empty() || !st.pop().equals('{'))
                    return false;
            }else{
                throw new Exception();
            }
        }
        if(st.empty())
            return true;
        else
            return false;
    }
}
