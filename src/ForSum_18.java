import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by henry on 2021/4/11.
 */
public class ForSum_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i + 1 < nums.length)
                for(int j = i + 1; j < nums.length; j++){
                    if(j + 1 < nums.length)
                        for(int k = j + 1; k < nums.length; k++){
                            if(k + 1 < nums.length)
                                for(int l = k + 1; l < nums.length; l++){
                                    if(nums[i] + nums[j] + nums[k] + nums[l] == target)
                                        res.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                                }
                        }
                }
        }
        return res;
    }
}
