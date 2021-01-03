import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by henry on 2021/1/3.
 */
public class LongestConsecutiveSequence_128 {
    public static void main(String[] args){
        int[] input = {0,3,7,2,5,8,4,6,0,1};
        LongestConsecutiveSequence_128 lc = new LongestConsecutiveSequence_128();
        System.out.println(lc.longestConsecutive(input));
    }

    public int longestConsecutive(int[] nums) {
        //solution: use HashSet to lookup consecutive numbers
        if(nums == null || nums.length==0)
            return 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int num: nums){
            set.add(num);
        }

        int curNum;
        int curConsecutive = 1;
        int longestConsecutive = 1;
        for(int num: set){
            if(!set.contains(num-1)){   //tricky point: only lookup consecutive seq at the beginning of a sub consecutive seq.
                curNum = num;
                curConsecutive = 1;
                while(set.contains(curNum + 1)){
                    curConsecutive++;
                    curNum++;
                }
                longestConsecutive = Math.max(curConsecutive, longestConsecutive);
            }
        }

        return longestConsecutive;

        //solution: by sorting
        /*if(nums == null || nums.length==0)
            return 0;
        Arrays.sort(nums);

        int curConsecutive = 1;
        int longestConsecutive = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                curConsecutive++;
            }else if(nums[i] == nums[i-1]){
                continue;
            }else{
                longestConsecutive = Math.max(curConsecutive, longestConsecutive);
                curConsecutive = 1;
            }
        }

        return Math.max(curConsecutive, longestConsecutive);*/
    }
}
