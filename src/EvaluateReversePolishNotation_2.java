import java.util.Stack;

/**
 * Created by blueskyee on 2016/3/5.
 */
public class EvaluateReversePolishNotation_2 {

    public static void main(String[] args) {
        String [] tokens = {"2","1","+","3","*"};
        int result = EvaluateReversePolishNotation_2.evalRPN(tokens);
        System.out.print("result:" + result);
    }

    public static int evalRPN(String[] tokens) {
        int result = 0;
        String operators = "+-*/";
        Stack<String> stack = new Stack<String>();

        for(String token:tokens){
            if(!operators.contains(token)){
                stack.push(token);
            }else{
                int secondNum = Integer.valueOf(stack.pop());
                int firstNum = Integer.valueOf(stack.pop());
                int operatorIdx = operators.indexOf(token);
                switch (operatorIdx){
                    case 0:
                        stack.push(String.valueOf(firstNum+secondNum));
                        break;
                    case 1:
                        stack.push(String.valueOf(firstNum-secondNum));
                        break;
                    case 2:
                        stack.push(String.valueOf(firstNum*secondNum));
                        break;
                    case 3:
                        stack.push(String.valueOf(firstNum/secondNum));
                        break;
                }
            }
        }

        result = Integer.valueOf(stack.pop());
        return result;
    }
}
