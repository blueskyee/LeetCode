import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by henry on 2020/12/25.
 */
public class PalindromePartitioning_131 {
    public static void main(String[] args){
        String input = "aabaa";
        PalindromePartitioning_131 pp = new PalindromePartitioning_131();
        System.out.println(pp.partition(input));
    }

    public List<List<String>> partition(String s) {
        /*List<Integer> partition = new ArrayList<Integer>();
        partition.add(0);
        partition.add(s.length());
        backTrack(res, partition, s, 1);*/

        List<List<String>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), s, 0);

        return res;
    }

    private void backTrack(List<List<String>> res, List<String> tempList, String s, int start){
        if(start == s.length()){
            res.add(new ArrayList<>(tempList));
        }else{
            for(int i=start; i<s.length(); i++){
                if(isPalindrome(s, start, i)){
                    tempList.add(s.substring(start, i+1));
                    backTrack(res, tempList, s, i+1);
                    tempList.remove(tempList.size()-1);
                }
            }
        }
    }

    //solution1: check palindrome by recording partition
    /*private void backTrack(List<List<String>> res, List<Integer> partitions, String s, int start){
        Collections.sort(partitions);
        boolean isPalindromePartition = true;
        for(int i=1; i<partitions.size(); i++){
            if(!isPalindrome(s,partitions.get(i-1),partitions.get(i)-1)){
                isPalindromePartition = false;
                break;
            }
        }
        if(isPalindromePartition){
            List<String> tempList = new ArrayList<>();
            for(int i=1; i<partitions.size(); i++){
                tempList.add(s.substring(partitions.get(i-1),partitions.get(i)));
            }
            res.add(tempList);
        }

        for(int i=start; i<s.length(); i++){
            partitions.add(i);
            backTrack(res, partitions, s, i+1);
            partitions.remove(partitions.size()-2);
        }
    }*/

    private boolean isPalindrome(String s, int begin, int end){
        while(begin < end){
            if(s.charAt(begin++) != s.charAt(end--))
                return false;
        }

        return true;
    }
}
