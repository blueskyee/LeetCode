import java.util.TreeSet;

/**
 * Created by henry on 2020/11/19.
 */
public class ContainsDuplicateIII_220 {
    public static void main(String[] args){
        //int[] input = {-2147483648,2147483647};
        //int[] input = {2147483646,2147483647};
        int[] input = {1,5,9,1,5,9};
        ContainsDuplicateIII_220 cd = new ContainsDuplicateIII_220();
        System.out.println(cd.containsNearbyAlmostDuplicate(input, 2, 3));
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        //use TreeSet (https://stackoverflow.com/questions/25602382/java-hashset-vs-treeset-when-should-i-use-over-other)
        if(nums.length < 2 || k < 1) return false;

        TreeSet<Long> set = new TreeSet<Long>();
        for(int i=0; i<nums.length; i++){
            Long floor = set.floor((long)nums[i]);
            Long ceiling = set.ceiling((long)nums[i]);
            if((floor != null && nums[i] - floor <= t) ||
                    (ceiling != null && ceiling - nums[i] <= t)){
                return true;
            }
            set.add((long)nums[i]);
            if(i >= k){
                set.remove((long)nums[i-k]);
            }
        }
        return false;

        //brute force: time limit exceeded
//        for(int i=1; i<nums.length; i++){
//            for(int j=i-1; j>=i-k && j>=0; j--){
//                if(Math.abs((long)nums[i]-nums[j]) <= t)
//                    return true;
//            }
//        }
//        return false;
    }
}
