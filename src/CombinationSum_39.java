import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2020/12/23.
 */
public class CombinationSum_39 {
    public static void main(String[] args){
        int[] input = {2,3,5};
        CombinationSum_39 cs = new CombinationSum_39();
        cs.combinationSum(input, 8);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<Integer>();
        backTracking(res, tempList, candidates, target, 0);

        return res;
    }

    private void backTracking(List<List<Integer>> res, List<Integer> tempList, int[] nums, int remain, int start){
        if(remain < 0){
            return;
        }else if (remain == 0){
            res.add(new ArrayList<>(tempList));
        }else{
            for(int i=start; i<nums.length; i++){
                tempList.add(nums[i]);
                backTracking(res, tempList, nums, remain-nums[i], i);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
