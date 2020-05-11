/**
 * Created by henry on 2018/10/17.
 */
public class RangeSumQueryImmutable_303 {
    public static void main(String[] args){
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        int param_1 = obj.sumRange(0,3);
        System.out.println(param_1);
    }
}

class NumArray {
    //sum[i] = nums[0] +...+ nums[i-1]; sum[0] = 0.
    private int[] sum;

    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for(int i=0; i<nums.length; i++){
            sum[i+1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j+1] - sum[i];
    }

//    private int[] sum;
//
//    public NumArray(int[] nums) {
//        sum = new int[nums.length];
//        sum[0] = nums[0];
//        for(int i=1; i<nums.length; i++){
//            sum[i] = sum[i-1] + nums[i];
//        }
//    }
//
//    public int sumRange(int i, int j) {
//        int result = 0;
//        if(i==0) {
//            result = sum[j];
//        }
//        else{
//            result = sum[j] - sum[i-1];
//        }
//        return result;
//    }
}