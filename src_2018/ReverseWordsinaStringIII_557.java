/**
 * Created by henry on 2019/1/14.
 */
public class ReverseWordsinaStringIII_557 {
    public static void main(String[] args){
        String input = "Let's take LeetCode contest";
        ReverseWordsinaStringIII_557 rw = new ReverseWordsinaStringIII_557();
        System.out.println(rw.reverseWords(input));
    }

    public String reverseWords(String s) {
        String [] strArr = s.split(" ");
        for(int i=0; i< strArr.length; i++){
            strArr[i] = new StringBuilder(strArr[i]).reverse().toString();
        }
        StringBuilder sb = new StringBuilder();
        for(String str:strArr){
            sb.append(str + " ");
        }

        return sb.toString().trim();
    }
}
