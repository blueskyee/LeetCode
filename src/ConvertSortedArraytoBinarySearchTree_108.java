/**
 * Created by henry on 2020/10/26.
 */
public class ConvertSortedArraytoBinarySearchTree_108 {
    public static void main(String[] args){
        int[] input = {-10,-3,0,5,9};
        ConvertSortedArraytoBinarySearchTree_108 csa
                = new ConvertSortedArraytoBinarySearchTree_108();
        System.out.println(csa.sortedArrayToBST(input));
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode tn = buildTree(nums, 0, nums.length-1);
        return tn;
    }

    private static TreeNode buildTree(int[] nums, int low, int high){
        if(low > high){
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode tn = new TreeNode(nums[mid]);
        tn.left = buildTree(nums, low, mid-1);
        tn.right = buildTree(nums, mid+1, high);
        return tn;
    }

}
