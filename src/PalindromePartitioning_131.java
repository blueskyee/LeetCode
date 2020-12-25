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
        List<List<String>> res = new ArrayList<>();
        List<Integer> partition = new ArrayList<Integer>();
        partition.add(0);
        partition.add(s.length());
        backTrack(res, partition, s, 1);

        return res;
    }

    private void backTrack(List<List<String>> res, List<Integer> partitions, String s, int start){
        Collections.sort(partitions);
        boolean isPalindromePartition = true;
        for(int i=1; i<partitions.size(); i++){
            if(!isPalindrome(s.substring(partitions.get(i-1),partitions.get(i)))){
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
    }

    private boolean isPalindrome(String s){
        for(int i=0,j=s.length()-1; i<j; i++,j--){
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
