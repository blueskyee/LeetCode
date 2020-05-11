/**
 * Created by henry on 2018/11/1.
 */
public class RansomNote_383 {
    public static void main(String[] args){
        RansomNote_383 rn = new RansomNote_383();
        System.out.print(rn.canConstruct("aa","aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charArr = new int[26];
        for(int i=0; i<magazine.length(); i++){
            charArr[magazine.charAt(i)-'a']++;
        }
        for(int i=0; i<ransomNote.length(); i++){
            if(--charArr[ransomNote.charAt(i)-'a']<0)
                return false;
        }
        return true;
    }
}
