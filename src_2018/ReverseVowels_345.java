
/**
 * Created by henry on 2018/10/25.
 */
public class ReverseVowels_345 {
    public static void main(String[] args){
        String input = "leetcode";
        ReverseVowels_345 rv = new ReverseVowels_345();
        System.out.println(rv.reverseVowels(input));
    }

    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while (start < end){
            while(start<end && !vowels.contains(chars[start]+"")){
                start++;
            }
            while(start<end && !vowels.contains(chars[end]+"")){
                end--;
            }
            //swap
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            //
            start++;
            end--;
        }
        return String.valueOf(chars);
    }
}
