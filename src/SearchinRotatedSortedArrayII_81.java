/**
 * Created by henry on 2021/2/1.
 */
public class SearchinRotatedSortedArrayII_81 {
    public static void main(String[] args){
        //int[] nums = {2,5,6,0,0,1,2};
        int[] nums = {1,0,1,1,1};
        SearchinRotatedSortedArrayII_81 sr = new SearchinRotatedSortedArrayII_81();
        System.out.println(sr.search(nums, 0));
    }

    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target) return true;

            //left side sorted
            if(nums[start] < nums[mid]){
                if(target > nums[mid] || target < nums[start]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }

            //right side sorted
            }else if(nums[start] > nums[mid]){
                if(target < nums[mid] || target > nums[end]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            //duplicate element from start to mid
            }else{
                start++;
            }
        }
        return false;
    }
}
