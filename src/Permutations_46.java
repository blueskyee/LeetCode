import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by henry on 2020/12/24.
 */
public class Permutations_46 {
    public static void main(String[] args){
        int[] input = {1,2,3};
        Permutations_46 per = new Permutations_46();
        System.out.println(per.permute(input));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), nums);

        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> tempList, int[] nums){
        if(tempList.size() == nums.length){
            res.add(new ArrayList<>(tempList));
        }else{
            for(int i=0; i<nums.length; i++){
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backTrack(res, tempList, nums);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    //solution1
    /*private void backTrack(List<List<Integer>> res, List<Integer> tempList, int[] nums, int start){
        if(tempList.size() == nums.length){
            res.add(new ArrayList<>(tempList));
        }else{
            for(int i=start,j=0; j<nums.length; i++,j++){
                i = i % nums.length;
                if(tempList.contains(nums[i])){
                    continue;
                }else{
                    tempList.add(nums[i]);
                    backTrack(res, tempList, nums, i==(nums.length-1)?0:(i+1));
                    tempList.remove(tempList.size()-1);
                }
            }
        }
    }*/
}
