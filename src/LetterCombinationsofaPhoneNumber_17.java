import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by henry on 2021/2/7.
 */
public class LetterCombinationsofaPhoneNumber_17 {
    public static void main(String[] args){
        String digits = "23";
        LetterCombinationsofaPhoneNumber_17 lc = new LetterCombinationsofaPhoneNumber_17();
        System.out.println(lc.letterCombinations(digits));
    }

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return null;

        List<List<Character>> letters = new ArrayList<>();
        letters.add(Arrays.asList('a','b','c'));
        letters.add(Arrays.asList('d','e','f'));
        letters.add(Arrays.asList('g','h','i'));
        letters.add(Arrays.asList('j','k','l'));
        letters.add(Arrays.asList('m','n','o'));
        letters.add(Arrays.asList('p','q','r','s'));
        letters.add(Arrays.asList('t','u','v'));
        letters.add(Arrays.asList('w','x','y','z'));

        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        getCombinations(digits, sb, res, letters);
        return res;
    }

    private void getCombinations(String digits, StringBuilder sb,
                                 List<String> res, List<List<Character>> letters){
        if(digits.isEmpty()){
            res.add(sb.toString());
            return;
        }

        //loop each char to get combination
        for(char c:letters.get(digits.charAt(0)-'2')){
            sb.append(c);
            getCombinations(digits.substring(1), sb, res, letters);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
