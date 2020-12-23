import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by henry on 2020/12/24.
 */
public class SubsetsII_90 {
    public static void main(String[] args){
        int[] intput = {1,2,2};
        SubsetsII_90 sb =  new SubsetsII_90();
        System.out.println(sb.subsetsWithDup(intput));
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res =  new ArrayList<>();
        backTrack(res, new ArrayList<Integer>(), nums, 0);
        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> tempList, int[] nums, int start){
        res.add(new ArrayList<>(tempList));
        for(int i=start; i<nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            tempList.add(nums[i]);
            backTrack(res, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
