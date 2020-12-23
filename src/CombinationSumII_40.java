import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by henry on 2020/12/23.
 */
public class CombinationSumII_40 {
    public static void main(String[] args){
        int[] input = {10,1,2,7,6,1,5};
        CombinationSumII_40 cs = new CombinationSumII_40();
        System.out.println(cs.combinationSum2(input, 8).size());
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<Integer>();
        Arrays.sort(candidates);
        backTracking(res, tempList, candidates, target, 0);

        return res;
    }

    private void backTracking(List<List<Integer>> res, List<Integer> tempList, int[] candidates, int remain, int start){
        if(remain < 0){
            return;
        }else if(remain == 0){
            res.add(new ArrayList<>(tempList));
        }else{
            for(int i=start; i<candidates.length; i++){
                if(i>start && candidates[i] == candidates[i-1]) continue;
                tempList.add(candidates[i]);
                backTracking(res, tempList, candidates, remain-candidates[i], i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
