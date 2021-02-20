import java.util.Stack;

/**
 * Created by henry on 2021/2/20.
 */
public class LongestAbsoluteFilePath_388 {
    public static void main(String[] args){
        String input =  "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        /*String[] arr = input.split("\n");
        for(String s: arr){
            System.out.println(s);
            System.out.println("last idx of \\t is:" + s.lastIndexOf("\t"));
        }*/
        LongestAbsoluteFilePath_388 lafp = new LongestAbsoluteFilePath_388();
        System.out.println(lafp.lengthLongestPath(input));
    }

    public int lengthLongestPath(String input) {
        int maxFileLen = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        String[] arr = input.split("\n");
        for(String s: arr){
            int numOfTabs = s.lastIndexOf("\t") + 1;
            int pathLevel = numOfTabs + 1;
            while (pathLevel < stack.size()){
                stack.pop();
            }
            int curPahtLen = stack.peek() + s.length() - numOfTabs + 1;
            stack.push(curPahtLen);
            if(s.contains(".")){
                maxFileLen = Math.max(maxFileLen, curPahtLen - 1);
            }
        }

        return maxFileLen;
    }
}
