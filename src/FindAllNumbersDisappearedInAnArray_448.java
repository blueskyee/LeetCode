import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2018/12/5.
 */
public class FindAllNumbersDisappearedInAnArray_448 {
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        FindAllNumbersDisappearedInAnArray_448 fan = new FindAllNumbersDisappearedInAnArray_448();
        System.out.println(fan.findDisappearedNumbers(nums));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0){
                nums[val] = -nums[val];
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                result.add(i+1);
            }
        }
        return result;
    }
}
