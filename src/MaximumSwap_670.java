import java.util.Arrays;
import java.util.Stack;

/**
 * Created by henry on 2021/3/7.
 */
public class MaximumSwap_670 {
    public static void main(String[] args){
        int num = 2736;
        MaximumSwap_670 ms = new MaximumSwap_670();
        System.out.println(ms.maximumSwap(num));
    }

    public int maximumSwap(int num) {
        /*At each digit of the input number in order,
        if there is a larger digit that occurs later,
        we know that the best swap must occur with the digit we are currently considering.*/
        char[] numArr = Integer.toString(num).toCharArray();
        int[] lastIdx = new int[10];
        for(int i = 0; i < numArr.length; i++){
            lastIdx[numArr[i] - '0'] = i;
        }

        for(int i = 0; i < numArr.length; i++){
            for(int d = 9; d > numArr[i] - '0'; d--){
                if(lastIdx[d] > i){
                    char temp = numArr[i];
                    numArr[i] = numArr[lastIdx[d]];
                    numArr[lastIdx[d]] = temp;
                    return Integer.valueOf(new String(numArr));
                }
            }
        }
        return num;
    }

/*    public int maximumSwap(int num) {
        //find the max digit and its idx
        //store each digit in stack
        //reorganize num from stack, and swap maximum digit with leading digit
        int maxDigit = 0, maxIdx = 1, curDigit = 0, curIdx = 1;
        Stack<Integer> stack = new Stack<>();
        while(num > 0){
            curDigit = num % 10;
            if(curDigit > maxDigit){
                maxDigit = curDigit;
                maxIdx = curIdx;
            }
            stack.push(curDigit);
            num /= 10;
            curIdx++;
        }
        int res = maxDigit;
        int swapIdx = curIdx - maxIdx - 1;
        curIdx = 1;
        int swapDigit = stack.pop();
        while(!stack.isEmpty()){
            if(swapIdx == curIdx){
                res = res * 10 + swapDigit;
                curIdx++;
                stack.pop();
            }else{
                res = res * 10 + stack.pop();
                curIdx++;
            }
        }

        return res;
    }*/
}
