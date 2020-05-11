import java.util.HashSet;

/**
 * Created by henry on 2018/10/26.
 */
public class IntersectionOfTwoArray_349 {
    public static void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        IntersectionOfTwoArray_349 ita = new IntersectionOfTwoArray_349();
        int[] result = ita.intersection(nums1, nums2);
        for(int i=0; i<result.length; i++)
            System.out.print(result[i] + ",");
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> intersect = new HashSet<Integer>();

        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(set1.contains(nums2[i])){
                intersect.add(nums2[i]);
            }
        }

        int[] result = new int[intersect.size()];
        int idx = 0;
        for(Integer i:intersect){
            result[idx++] = i;
        }

        return result;
    }
}
