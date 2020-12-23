import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2020/12/24.
 */
public class Subsets_78 {
    public static void main(String[] args){
        int[] input = {1,2,3};
        Subsets_78 sb = new Subsets_78();
        System.out.println(sb.subsets(input));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<Integer>();
        backTracking(res, tempList, nums, 0);
        return res;
    }

    private void backTracking(List<List<Integer>> res, List<Integer> tempList, int[] nums, int start){
        res.add(new ArrayList<Integer>(tempList));
        for(int i=start; i<nums.length; i++){
            tempList.add(nums[i]);
            backTracking(res, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }

}
