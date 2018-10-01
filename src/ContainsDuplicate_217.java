import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by henry on 2018/10/1.
 */
public class ContainsDuplicate_217 {
    public static void main(String[] args){
        int[] input = {1,2,3,1};
        ContainsDuplicate_217 cd = new ContainsDuplicate_217();
        System.out.println(cd.containsDuplicate(input));
    }

    public boolean containsDuplicate(int[] nums) {
        //solution 1
//        Arrays.sort(nums);
//        for(int i=1; i<nums.length; i++){
//            if(nums[i] == nums[i-1]) return true;
//        }
//        return false;

        //solution2
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i :nums){
            if(hs.contains(i)) return true;
            hs.add(i);
        }
        return false;
    }
}
