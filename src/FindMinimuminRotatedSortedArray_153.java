/**
 * Created by henry on 2020/12/22.
 */
public class FindMinimuminRotatedSortedArray_153 {
    public static void main(String[] args){
        int[] input = {3,4,5,1,2};
        FindMinimuminRotatedSortedArray_153 fm = new FindMinimuminRotatedSortedArray_153();
        System.out.println(fm.findMin(input));
    }

    public int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
        int left = 0;
        int right = nums.length-1;
        if(nums[left] < nums[right]) return nums[left];
        while (left < right){
            int mid = (left + right) / 2;
            if(nums[mid] > nums[mid+1]) return nums[mid+1];
            if(nums[mid-1] > nums[mid]) return nums[mid];
            if(nums[left] > nums[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return -1;
    }
}
