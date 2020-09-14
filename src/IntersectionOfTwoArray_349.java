import java.util.HashSet;

/**
 * Created by henry on 2020/9/14.
 */
public class IntersectionOfTwoArray_349 {
    public static void main(String[] args){
        int [] num1 = {4,9,5};
        int [] num2 = {9,4,9,8,4};

        IntersectionOfTwoArray_349 ita = new IntersectionOfTwoArray_349();
        System.out.println(ita.intersection(num1, num2));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> num1Set = new HashSet<Integer>();
        HashSet<Integer> interSet = new HashSet<Integer>();

        for(int i=0; i<nums1.length; i++){
            num1Set.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(num1Set.contains(nums2[i])){
                interSet.add(nums2[i]);
            }
        }

        int[] result = new int[interSet.size()];
        int idx = 0;
        for(Integer i:interSet){
            result[idx++] = i;
        }

        return result;
    }
}
