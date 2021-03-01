/**
 * Created by henry on 2021/3/1.
 */
public class PermutationinString_567 {

    public static void main(String[] args){
        String s1 = "ab";
        String s2 = "eidbaooo";
        PermutationinString_567 ps = new PermutationinString_567();
        System.out.println(ps.checkInclusion(s1, s2));
    }

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;

        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for(int i = 0; i < s1.length(); i++){
            s1Arr[s1.charAt(i) - 'a']++;
            s2Arr[s2.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s2.length() - s1.length(); i++){
            if(match(s1Arr, s2Arr))
                return true;
            s2Arr[s2.charAt(i + s1.length()) - 'a']++;
            s2Arr[s2.charAt(i) - 'a']--;
        }
        return match(s1Arr, s2Arr);
    }

    private boolean match(int[] s1Arr, int[] s2Arr){
        for(int i = 0; i < s1Arr.length; i++){
            if(s1Arr[i] != s2Arr[i])
                return false;
        }
        return true;
    }
}
