import java.util.*;

/**
 * Created by henry on 2020/12/24.
 */
public class PermutationsII_47 {
    public static void main(String[] args){
        int[] input = {1,1,2};
        PermutationsII_47 pm = new PermutationsII_47();
        System.out.println(pm.permuteUnique(input));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set set = new HashSet<>();
        Arrays.sort(nums);
        backTrack(res, new ArrayList<Integer>(), nums, set);

        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> tempList, int[] nums, Set set){
        if(tempList.size() == nums.length){
            res.add(new ArrayList<>(tempList));
        }else{
            for(int i=0; i<nums.length; i++){
                if(set.contains(i) || (i > 0 && nums[i] == nums[i-1] && !set.contains(i-1))) continue;
                set.add(i);
                tempList.add(nums[i]);
                backTrack(res, tempList, nums, set);
                set.remove(i);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
