import sun.reflect.annotation.ExceptionProxy;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by blueskyee on 2016/2/17.
 */
public class ValidParentheses_14 {
    public static void main(String[] args) {
        String testStr = "[(valid string)]";
        try {
            ValidParentheses_14 vp = new ValidParentheses_14();
            System.out.print("string is valid:" + vp.isValid(testStr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isValid(String s)  throws Exception{
        HashMap<Character,Character> parenthesesMap
                = new HashMap<Character,Character>();
        parenthesesMap.put('(',')');
        parenthesesMap.put('[',']');
        parenthesesMap.put('{','}');

        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(parenthesesMap.containsKey(curr)){
                stack.push(curr);
            }else if(parenthesesMap.containsValue(curr)){
                if(!stack.isEmpty() && parenthesesMap.get(stack.pop())==curr){
                    //
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
