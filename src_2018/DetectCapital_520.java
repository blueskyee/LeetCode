/**
 * Created by henry on 2018/12/28.
 */
public class DetectCapital_520 {
    public static void main(String[] args){
        String input = "GooGle";
        DetectCapital_520 dc = new DetectCapital_520();
        System.out.println(dc.detectCapitalUse(input));
    }

    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }
}
