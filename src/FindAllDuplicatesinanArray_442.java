import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2021/2/15.
 */
public class FindAllDuplicatesinanArray_442 {
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        FindAllDuplicatesinanArray_442 fd = new FindAllDuplicatesinanArray_442();
        System.out.println(fd.findDuplicates(nums));
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] < 0){
                res.add(idx + 1);
            }
            nums[idx] = -nums[idx];
        }
        return res;
    }
}
