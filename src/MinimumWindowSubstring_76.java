/**
 * Created by henry on 2021/3/24.
 */
public class MinimumWindowSubstring_76 {

    public String minWindow(String s, String t) {
        //english letter and 0~9 can be represented as 0~127 ASCII value
        int[] charMap = new int[128];
        for(char c: t.toCharArray()){
            charMap[c]++;
        }
        //sliding window
        int start = 0, end = 0;
        int head = 0, counter = t.length(), d = Integer.MAX_VALUE;
        while(end < s.length()){
            if(charMap[s.charAt(end)] > 0)
                counter--;
            charMap[s.charAt(end)]--;
            end++;
            while(counter == 0){
                if(end - start < d){
                    head = start;
                    d = end - head;
                }
                if(charMap[s.charAt(start)] == 0)
                    counter++;
                charMap[s.charAt(start)]++;
                start++;
            }
        }
        String res = "";
        if(d < Integer.MAX_VALUE)
            res = s.substring(head, d);
        return res;
    }
}
