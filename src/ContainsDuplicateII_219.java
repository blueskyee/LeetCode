import java.util.HashMap;

/**
 * Created by henry on 2018/10/3.
 */
public class ContainsDuplicateII_219 {
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        ContainsDuplicateII_219 cd = new ContainsDuplicateII_219();
        System.out.println(cd.containsNearbyDuplicate(nums, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                if(i - hm.get(nums[i]) <= k)
                    return true;
            }
            hm.put(nums[i], i);
        }
        return false;
    }

/*    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                if((i - map.get(nums[i])) <= k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }*/
}
