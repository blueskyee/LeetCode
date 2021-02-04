import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2021/2/4.
 */
public class MajorityElementII_229 {
    public static void main(String[] args){
        int[] nums = {1,2,2,1,2,1};
        MajorityElementII_229 me = new MajorityElementII_229();
        System.out.println(me.majorityElement(nums));
    }

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return res;
        int candidate1 = 0, candidate2 = 1, count1 = 0, count2 = 0;
        for(int num : nums){
            if(num == candidate1){
                count1++;
            }else if(num == candidate2){
                count2++;
            }else if(count1 == 0){
                candidate1 = num;
                count1++;
            }else if(count2 == 0){
                candidate2 = num;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num:nums){
            if(num == candidate1)
                count1++;
            else if(num == candidate2)
                count2++;
        }
        if(count1 > nums.length / 3)
            res.add(candidate1);
        if(count2 > nums.length / 3)
            res.add(candidate2);
        return res;
    }
}
