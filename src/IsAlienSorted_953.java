/**
 * Created by henry on 2020/9/9.
 */
public class IsAlienSorted_953 {
    public static void main(String[] args){
        String[] words = {"apple","app"};
        String order = "abcdefghijklmnopqrstuvwxyz";

        IsAlienSorted_953 ia = new IsAlienSorted_953();
        System.out.println(ia.isAlienSorted(words, order));
    }

    int[] maps = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        for(int i =0; i<26; i++){
            maps[order.charAt(i) - 'a'] = i;
        }
        for(int i=1; i<words.length; i++){
            if(bigger(words[i-1], words[i]))
                return false;
        }
        return true;
    }

    public boolean bigger(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        for(int i=0; i<l1 && i<l2; i++){
            if(str1.charAt(i) != str2.charAt(i))
                return maps[str1.charAt(i) - 'a'] > maps[str2.charAt(i) - 'a'];
        }
        return l1>l2;
    }
}
