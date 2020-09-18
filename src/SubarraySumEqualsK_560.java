import java.util.HashMap;
import java.util.Map;

/**
 * Created by henry on 2020/9/18.
 */
public class SubarraySumEqualsK_560 {
    public static void main(String[] args){
        int[] input = {1,1,1};

        SubarraySumEqualsK_560 ss = new SubarraySumEqualsK_560();
        System.out.println(ss.subarraySum(input, 2));
    }

    public int subarraySum(int[] nums, int k) {
        //solution1: prefix sum
        /*int res = 0;
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] == k) res++;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] - nums[i] == k) res++;
            }
        }

        return res;*/

        //solution2: use 'sum' to record current prefix sum, and hashmap to record prefix sum frequency.
        int sum = 0;
        int res = 0;
        Map<Integer, Integer> prefixSum = new HashMap<Integer, Integer>();

        prefixSum.put(0,1); //special case: single element equals to k
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            res += prefixSum.getOrDefault(sum-k,0);
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0)+1);
        }

        return res;
    }
}
