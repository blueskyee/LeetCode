import java.util.Stack;

/**
 * Created by henry on 2020/9/15.
 */
public class MinimumRemovetoMakeValidParentheses_1249 {
    public static void main(String[] args){
        String input = "(a(b(c)d)";

        MinimumRemovetoMakeValidParentheses_1249 mv = new MinimumRemovetoMakeValidParentheses_1249();
        System.out.println(mv.minRemoveToMakeValid(input));
    }

    public String minRemoveToMakeValid(String s) {
        //create a stack to track parenthesis pair
        //record the mismatch numbers to remove

        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<Integer>();
        int rightParen = 0;
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == '('){
                stack.push(i);
            }else if(sb.charAt(i) == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    sb.setCharAt(i, '*');
                }
            }
        }

        while(!stack.isEmpty()){
            sb.setCharAt(stack.pop(), '*');
        }

        return sb.toString().replace("*","");
    }
}
