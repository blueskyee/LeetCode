/**
 * Created by henry on 2018/7/17.
 */
public class TwoSum_1 {
    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};

        TwoSum_1 ts = new TwoSum_1();
        int[] result = ts.twoSum(num, 9);
        for (int re:result){
            System.out.print("ind:" + re);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
