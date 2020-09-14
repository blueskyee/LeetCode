import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by henry on 2020/9/14.
 */
public class GoatLatin_824 {
    public static void main(String[] args){
        String input = "I speak Goat Latin";

        GoatLatin_824 gl = new GoatLatin_824();
        System.out.println(gl.toGoatLatin(input));
    }

    public String toGoatLatin(String S) {
        //split string to array
        //  begin with vowel, add ma to the end
        //  begin with consonant, move first char to the end
        //  add a to the end

        Set<Character> vowelSet
                = new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        String[] words = S.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length; i++){
            sb.append(' ');
            if(vowelSet.contains(words[i].charAt(0))){
                sb.append(words[i]).append("ma");
            }else{
                sb.append(words[i].substring(1)).append(words[i].charAt(0)).append("ma");
            }
            for(int j=0; j<=i; j++){
                sb.append('a');
            }
        }

        return sb.toString().substring(1);
    }
}
